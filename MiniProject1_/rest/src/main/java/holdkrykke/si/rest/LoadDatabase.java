package holdkrykke.si.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    private static ArrayList<Grade> grades = new ArrayList<>();

    static {
        grades.add(new Grade("Maths", "2021", "A"));
        grades.add(new Grade("Social Studies", "2021", "F"));
        grades.add(new Grade("Home Economics", "2021", "C"));
    }

    @Bean
    CommandLineRunner initDatabase1(GradeRepository repository) {
        return args -> {
            grades.forEach((grade -> log.info("Preloading " + repository.save(grade))));
        };
    }

    @Bean
    CommandLineRunner initDatabase2(StudentRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Student(
                    "testFirstName",
                    "testLastName",
                    grades)));
            log.info("Preloading " + repository.save(new Student(
                    "test2FirstName",
                    "test2LastName",
                    List.of(grades.get(2)))));
        };
    }
}
