package br.com.samuelramon.estudospringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.samuelramon.estudospringboot.entity.User;
import br.com.samuelramon.estudospringboot.entity.Vehicle;
import br.com.samuelramon.estudospringboot.repository.UserRepository;
import br.com.samuelramon.estudospringboot.repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

	@Autowired
    VehicleRepository vehicles;
	
	@Autowired
    UserRepository users;
	
	@Autowired
    PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		log.debug("Initializing vehicles data...");
		
		Arrays.asList("moto", "car")
			.forEach(v -> this.vehicles.saveAndFlush(
				Vehicle.builder().name(v).build()));
		
		log.debug("Printing all vehicles...");
        this.vehicles.findAll().forEach(v -> log.debug(" Vehicle :" + v.toString()));
        
        this.users.save(User.builder()
            .username("user")
            .password(this.passwordEncoder.encode("password"))
            .roles(Arrays.asList( "ROLE_USER"))
            .build()
        );
        
        this.users.save(User.builder()
            .username("admin")
            .password(this.passwordEncoder.encode("password"))
            .roles(Arrays.asList("ROLE_USER", "ROLE_ADMIN"))
            .build()
        );
        
        log.debug("printing all users...");
        this.users.findAll().forEach(v -> log.debug(" User :" + v.toString()));
	}

}
