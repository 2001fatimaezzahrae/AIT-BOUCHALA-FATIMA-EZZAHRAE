package ma.fac.hospital.Repository;

import ma.fac.hospital.entities.Medecin;
import ma.fac.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
