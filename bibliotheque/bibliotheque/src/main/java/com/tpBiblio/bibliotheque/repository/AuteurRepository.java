package com.tpBiblio.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tpBiblio.bibliotheque.entity.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur,Integer>{
    
}
