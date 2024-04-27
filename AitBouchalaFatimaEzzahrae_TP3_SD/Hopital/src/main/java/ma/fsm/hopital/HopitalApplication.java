package ma.fsm.hopital;

import ma.fsm.hopital.entities.Patient;
import ma.fsm.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication  implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {

		SpringApplication.run(HopitalApplication.class, args);
	}
@Override
public void run(String... args) throws Exception {

        /*Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);
        Patient patient2 = new Patient(null, "Yassine", new Date(), false, 123);
        Patient patient3 = Patient.builder()
                                    .nom("Imane")
                                    .dateNaissance(new Date())
                                    .score(56)
                                    .malade(true)
                                    .build();*/
	patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 134));
	patientRepository.save(new Patient(null, "Hanane", new Date(), false, 421));
	patientRepository.save(new Patient(null, "Imane", new Date(), true, 134));
}
@Bean
PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
}
}
