package holdkrykke.clientserver;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@FeignClient(name = "students", url = "/students")
@RibbonClient(name = "students", configuration = RibbonConfig.class)
public interface Client {
    @GetMapping("/students")
    CollectionModel<Student> readStudents();
}
