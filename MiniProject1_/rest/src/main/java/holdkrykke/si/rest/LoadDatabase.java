package holdkrykke.si.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


//    @Bean
//    CommandLineRunner initDatabase2(StudentRepository repository) {
//        return args -> {
//            log.info("Preloading " + repository.save(new Student(
//                    "testFirstName",
//                    "testLastName",
//                    null)));
//            log.info("Preloading " + repository.save(new Student(
//                    "test2FirstName",
//                    "test2LastName",
//                    null)));
//        };
//    }
}
