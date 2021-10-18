package holdkrykke.teacher.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import holdkrykke.teacher.exceptions.TeacherNotFoundException;
import holdkrykke.teacher.model.Teacher;
import holdkrykke.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/teachers")
public class TeacherResource {
    @Autowired
    TeacherRepository repo;

    @GetMapping("/")
    public List<Teacher> retrieveAllTeachers(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public EntityModel<Teacher> retrieveTeacher(@PathVariable long id) {
        Optional<Teacher> teacher = repo.findById(id);
        if (!teacher.isPresent())
            throw new TeacherNotFoundException("id: " + id);

        EntityModel<Teacher> resource = EntityModel.of(teacher.get());
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllTeachers());
        resource.add(linkTo.withRel("all-teachers"));

        Link selfLink = linkTo(methodOn(this.getClass()).retrieveTeacher(id)).withSelfRel();
        resource.add(selfLink);
        return resource;
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable long id) {
        repo.deleteById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Object> createTeacher(@RequestBody Teacher teacher) {
        Teacher savedTeacher = repo.save(teacher);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedTeacher.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTeacher(@RequestBody Teacher teacher, @PathVariable long id) {
        Optional<Teacher> teacherOptional = repo.findById(id);
        if (!teacherOptional.isPresent())
            return ResponseEntity.notFound().build();
        teacher.setId(id);
        repo.save(teacher);
        return ResponseEntity.noContent().build();
    }
}