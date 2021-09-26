package holdkrykke.si.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    private static ArrayList<Student.Grade> grades = new ArrayList<>();
    private static ArrayList<Student.Grade> grades2 = new ArrayList<>();


    static {
        grades.add(new Student.Grade("Maths", "2021", "C"));
        grades.add(new Student.Grade("Social Studies", "2021", "D"));
        grades.add(new Student.Grade("Home Economics", "2021", "F"));
        grades2.add(new Student.Grade("System Integration", "2021", "A"));
    }

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Student(
                    "testFirstName",
                    "testLastName",
                    grades)));
            log.info("Preloading " + repository.save(new Student(
                    "test2FirstName",
                    "test2LastName",
                    grades2)));
        };
    }
}
