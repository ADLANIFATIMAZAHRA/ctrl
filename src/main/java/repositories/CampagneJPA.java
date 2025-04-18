package repositories;

import entities.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampagneJPA extends JpaRepository<Campagne, Long> {
}
