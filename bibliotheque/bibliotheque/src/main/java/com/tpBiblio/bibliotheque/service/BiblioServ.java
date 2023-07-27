package com.tpBiblio.bibliotheque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpBiblio.bibliotheque.entity.Auteur;
import com.tpBiblio.bibliotheque.entity.Categorie;
import com.tpBiblio.bibliotheque.entity.Livre;
import com.tpBiblio.bibliotheque.repository.AuteurRepository;
import com.tpBiblio.bibliotheque.repository.CategorieRepository;
import com.tpBiblio.bibliotheque.repository.LivreRepository;

@Service
public class BiblioServ {

    @Autowired
    AuteurRepository auteurRepository;

    @Autowired
    LivreRepository livreRepository;

    @Autowired
    CategorieRepository categorieRepository;


    public void addCategorie(Categorie categorie){
        categorieRepository.save(categorie);
    }

    public void addAuteur(Auteur auteur){
       auteurRepository.save(auteur);
    }


    public void addLivre(Livre livre){
        livreRepository.save(livre);

    }

     public List<Livre> getLivres(){
        return livreRepository.findAll();
     }
    
}
