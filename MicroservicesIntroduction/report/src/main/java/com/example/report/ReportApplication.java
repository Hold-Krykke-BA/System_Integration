package com.example.report;

import com.example.report.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReportApplication implements CommandLineRunner {

    @Autowired
    private ReportRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var result = repo.count();
        System.out.println(result);
        //application.properties
    }
}
