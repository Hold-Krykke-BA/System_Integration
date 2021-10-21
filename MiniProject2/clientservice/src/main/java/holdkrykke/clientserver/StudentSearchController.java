package holdkrykke.clientserver;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class StudentSearchController {

    private Client client = null;

    public StudentSearchController(Client _client) {
        this.client = _client;
    }

    @ResponseBody
    @CrossOrigin(origins = "*") // allow request from any client
    @HystrixCommand(fallbackMethod = "fallback") // in case of failure
    @GetMapping("/students")
    public Collection<Student> myStudents() {
        System.out.println("Test students endpoint");
        var result = client.readStudents()
                .getContent()
                .stream()
                .filter(this::isMine)
                .collect(Collectors.toList());
        System.out.println("result " + result);
        return result;
    }

    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    private boolean isMine(Student student) {
        System.out.println("*****************TEST*******************");
        System.out.println(student.getName().contains("n"));
        return student.getName().contains("n");
    }

    private Collection<Student> fallback() {
        System.out.println("Fallback hit");
        var res = new ArrayList<Student>();
        res.add(new Student("Fallback, not an actual student"));
        return res;
    }
}