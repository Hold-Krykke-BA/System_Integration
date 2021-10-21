package holdkrykke.clientserver;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
//import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@FeignClient("students")
@RibbonClient(name="students", configuration = RibbonConfig.class)
public interface Client
{
    @GetMapping("/school")
    Resources<Student> readStudents();
}
