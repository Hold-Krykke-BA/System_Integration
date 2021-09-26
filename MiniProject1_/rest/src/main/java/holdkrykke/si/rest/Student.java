package holdkrykke.si.rest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {
    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    @OneToMany
    private List<Grade> grades;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, List grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public Student(String firstName, String lastName, List<Grade> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId().equals(student.getId()) && getFirstName().equals(student.getFirstName()) && getLastName().equals(student.getLastName()) && Objects.equals(getGrades(), student.getGrades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getGrades());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}';
    }

    private class Grade {
        private String subject, year, grade;

        public Grade() {
        }

        public Grade(String subject, String year, String grade) {
            this.subject = subject;
            this.year = year;
            this.grade = grade;
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
}
