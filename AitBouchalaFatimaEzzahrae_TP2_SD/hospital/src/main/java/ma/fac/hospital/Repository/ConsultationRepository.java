package ma.fac.hospital.Repository;

import ma.fac.hospital.entities.Consultation;
import ma.fac.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
