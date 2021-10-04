package com.example.report.repository;

import com.example.report.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {
    public List<Report> findByCompleted(boolean value);
}

