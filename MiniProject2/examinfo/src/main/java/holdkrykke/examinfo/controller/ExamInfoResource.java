package holdkrykke.examinfo.controller;

import holdkrykke.examinfo.excptions.ExamInfoNotFoundException;
import holdkrykke.examinfo.model.ExamInfo;
import holdkrykke.examinfo.repository.ExamInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/examinfo")
public class ExamInfoResource {
    @Autowired
    ExamInfoRepository repo;

    @GetMapping("/")
    public List<ExamInfo> retrieveAllExamInfo(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public EntityModel<ExamInfo> retrieveExamInfo(@PathVariable long id) {
        Optional<ExamInfo> examInfo = repo.findById(id);
        if (!examInfo.isPresent())
            throw new ExamInfoNotFoundException("id: " + id);

        EntityModel<ExamInfo> resource = EntityModel.of(examInfo.get());
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllExamInfo());
        resource.add(linkTo.withRel("all-examinfo"));

        Link selfLink = linkTo(methodOn(this.getClass()).retrieveExamInfo(id)).withSelfRel();
        resource.add(selfLink);
        return resource;
    }

    @DeleteMapping("/{id}")
    public void deleteExamInfo(@PathVariable long id) {
        repo.deleteById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Object> createExamInfo(@RequestBody ExamInfo examInfo) {
        ExamInfo savedExamInfo = repo.save(examInfo);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedExamInfo.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateExamInfo(@RequestBody ExamInfo examInfo, @PathVariable long id) {
        Optional<ExamInfo> examInfoOptional = repo.findById(id);
        if (!examInfoOptional.isPresent())
            return ResponseEntity.notFound().build();
        examInfo.setId(id);
        repo.save(examInfo);
        return ResponseEntity.noContent().build();
    }
}