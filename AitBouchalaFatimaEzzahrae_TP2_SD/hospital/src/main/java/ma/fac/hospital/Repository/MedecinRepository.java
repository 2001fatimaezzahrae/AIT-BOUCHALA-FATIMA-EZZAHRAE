package ma.fac.hospital.Repository;

import ma.fac.hospital.entities.Medecin;
import ma.fac.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}
