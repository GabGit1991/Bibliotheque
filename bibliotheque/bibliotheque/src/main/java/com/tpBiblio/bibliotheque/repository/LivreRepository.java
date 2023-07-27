package com.tpBiblio.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tpBiblio.bibliotheque.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre,Integer> {
    
}
