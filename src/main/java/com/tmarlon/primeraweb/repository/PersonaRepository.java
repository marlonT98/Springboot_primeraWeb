package com.tmarlon.primeraweb.repository;

import com.tmarlon.primeraweb.entites.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//estereotipos
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
