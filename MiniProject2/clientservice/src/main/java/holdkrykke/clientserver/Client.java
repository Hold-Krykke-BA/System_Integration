package holdkrykke.clientserver;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.hateoas.Resources;

@CrossOrigin
@FeignClient("students")
public interface Client
{
    @GetMapping("/students")
    Resources<Student> readStudents();
}
