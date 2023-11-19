package com.nayrouz.LSI3_SOA_TP6.repositories;
import com.nayrouz.LSI3_SOA_TP6.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}