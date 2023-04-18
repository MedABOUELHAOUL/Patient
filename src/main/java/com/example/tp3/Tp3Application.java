package com.example.tp3;

import com.example.tp3.entites.Patient;
import com.example.tp3.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class Tp3Application {

    public static void main(String[] args) {
            SpringApplication.run(Tp3Application.class, args);
    }
     @Bean
    CommandLineRunner start(PatientRepository patientRepository){
         return args ->{

             patientRepository.save(new Patient(null,"Hamza",new Date(),true,(int)(Math.random()*100)));
             patientRepository.save(new Patient(null,"Hassan",new Date(),false,(int)(Math.random()*100)));
             patientRepository.save(new Patient(null,"Hajar",new Date(),false,(int)(Math.random()*100)));
             patientRepository.save(new Patient(null,"Imane",new Date(),true,(int)(Math.random()*100)));


     };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}



