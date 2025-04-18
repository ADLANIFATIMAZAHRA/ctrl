package repositories;

import entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationJPA extends JpaRepository<Donation, Long> {
}
