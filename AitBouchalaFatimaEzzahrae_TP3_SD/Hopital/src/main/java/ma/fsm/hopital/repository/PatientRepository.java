package ma.fsm.hopital.repository;

import ma.fsm.hopital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository  extends JpaRepository<Patient,Long> {




    // 1ere methode
    Page<Patient> findByNomContains(String keyword, Pageable pageable);

    //2eme methode
    @Query("select p from Patient p where p.nom like :x")
    Page<Patient> chercher(@Param("x") String keyword, Pageable pageable);
}
