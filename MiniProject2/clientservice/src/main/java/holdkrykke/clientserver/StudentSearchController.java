package holdkrykke.clientserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@EnableAutoConfiguration
public class StudentSearchController
{
    private Client client = null;

    public StudentSearchController(Client _client)
    {
        this.client = _client;
    }

    @ResponseBody
    @CrossOrigin(origins = "*") // allow request from any client
    @GetMapping("/students")
    public Collection<Student> myStudents()
    {
        return client.readStudents()
                .getContent()
                .stream()
                .filter(this :: isMine)
                .collect(Collectors.toList());
    }

    private boolean isMine(Student student)
    {
        System.out.println("*****************TEST*******************");
        System.out.println(student.getName().contains("n"));
        return  student.getName().contains("n");
    }
    private Collection<Student> fallback()
    {
        return new ArrayList<>();
    }
}