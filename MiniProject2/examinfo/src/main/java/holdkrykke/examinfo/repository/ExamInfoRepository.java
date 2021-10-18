package holdkrykke.examinfo.repository;

import holdkrykke.examinfo.model.ExamInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamInfoRepository  extends JpaRepository<ExamInfo, Long> {
}
