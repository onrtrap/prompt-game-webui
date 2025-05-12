package proj.promptgame.prompthandler.repository;

import proj.promptgame.prompthandler.model.Prompt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromptRepository extends JpaRepository<Prompt, Long>{
}
