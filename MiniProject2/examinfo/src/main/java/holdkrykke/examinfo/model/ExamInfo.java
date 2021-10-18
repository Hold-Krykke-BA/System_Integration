package holdkrykke.examinfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class ExamInfo {
    @Id
    @GeneratedValue
    private Long id;
    private Date examDate;

    // Giver det mening at have med her? Skal hentes fra de andre apps
//    private Date examDate;
//    private Long courseID;
//    private Long teacherID;
//    private Long censorID;
//    private Long studentID;

    public ExamInfo() {
        super();
    }

    public ExamInfo(Long id, Date date) {
        super();
        this.id = id;
        this.examDate = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExamDate() {
        return examDate;
    }
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}
