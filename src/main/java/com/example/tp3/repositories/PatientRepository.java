package com.example.tp3.repositories;

import com.example.tp3.entites.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    List<Patient> findAll();

    @Override
    Optional<Patient> findById(Long aLong);

    Page<Patient> findByNomContains(String kw, Pageable pageable);

}