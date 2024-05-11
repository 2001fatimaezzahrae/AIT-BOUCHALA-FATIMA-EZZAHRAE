package ma.fsm.hopital;

import ma.fsm.hopital.entities.Patient;
import ma.fsm.hopital.repository.PatientRepository;
import ma.fsm.hopital.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

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
	patientRepository.save(new Patient(null, "layla", new Date(), true, 164));
}
//@Bean
CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){

		return args -> {

			UserDetails u1= jdbcUserDetailsManager.loadUserByUsername("user11");

			if(u1==null)

			    jdbcUserDetailsManager.createUser(

					User.withUsername("user11").password(passwordEncoder().encode("1234")).roles("USER").build()
			);
			UserDetails u2= jdbcUserDetailsManager.loadUserByUsername("user22");

			if(u2==null)
			    jdbcUserDetailsManager.createUser(

					User.withUsername("user22").password(passwordEncoder().encode("1234")).roles("USER").build()
			);
			UserDetails u3= jdbcUserDetailsManager.loadUserByUsername("admin2");

			if(u3==null)
				jdbcUserDetailsManager.createUser(

					User.withUsername("admin2").password(passwordEncoder().encode("1234")).roles("USER","ADMIN").build()
			);

        };
}
//@Bean
CommandLineRunner commandLineRunnerUserDetails(AccountService accountService){

		return  args -> {
			accountService.addNewRole("USER");
			accountService.addNewRole("ADMIN");
			accountService.addNewUser("user1","1234","user1@gmail.com","1234");
			accountService.addNewUser("user2","1234","user2@gmail.com","1234");
			accountService.addNewUser("admin","1234","admin@gmail.com","1234");

			accountService.addRoleToUser("user1","USER");
			accountService.addRoleToUser("user2","USER");
			accountService.addRoleToUser("admin","USER");
			accountService.addRoleToUser("admin","ADMIN");


		};
}

@Bean
PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
}
}
