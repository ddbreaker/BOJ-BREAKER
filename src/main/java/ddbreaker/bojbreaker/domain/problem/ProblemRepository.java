package ddbreaker.bojbreaker.domain.problem;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProblemRepository extends JpaRepository<Problem, Long> {

    Optional<Problem> findByProblemId(Long problemId);
}
