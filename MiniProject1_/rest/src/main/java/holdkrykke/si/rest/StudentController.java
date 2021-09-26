package holdkrykke.si.rest;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    private List<Student> getAllStudents() {
        return service.findAll();
    }

    @GetMapping("/students/{id}")
    private Student getStudent(@PathVariable("id") long id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    private void deleteStudent(@PathVariable("id") long id) {
        service.delete(id);
    }

    @PostMapping("/students")
    private ResponseEntity<Object> saveStudent(@RequestBody Student student) {
        service.saveOrUpdate(student);
        HashMap<String, String> result = new HashMap<>();
        result.put("status", "Success");
        result.put("id", student.getId().toString());
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
