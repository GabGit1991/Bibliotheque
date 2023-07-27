package com.tpBiblio.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tpBiblio.bibliotheque.entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
    
}
