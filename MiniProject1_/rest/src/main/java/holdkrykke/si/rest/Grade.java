package holdkrykke.si.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Grade {
    private @Id
    @GeneratedValue
    Long id;
    private String subject, year, grade;

    public Grade() {
    }

    public Grade(String subject, String year, String grade) {
        this.subject = subject;
        this.year = year;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grade)) return false;
        Grade grade1 = (Grade) o;
        return Objects.equals(getSubject(), grade1.getSubject()) && Objects.equals(getYear(), grade1.getYear()) && Objects.equals(getGrade(), grade1.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubject(), getYear(), getGrade());
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", year='" + year + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
