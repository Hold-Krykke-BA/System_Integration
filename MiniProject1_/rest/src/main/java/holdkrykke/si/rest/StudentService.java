package holdkrykke.si.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student> findAll() {
        List<Student> result = new ArrayList();
        repository.findAll().forEach(result::add); //convert iterable to list
        return result;
    }

    public Student getStudentById(long id) {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Student student) {
        repository.save(student);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
