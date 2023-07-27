package com.tpBiblio.bibliotheque.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="livre")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titre;

    //Un auteur peut avoir plusieurs livres, un livre ne peut avoir qu'un seul auteur
    @ManyToOne
    private Auteur auteur;

    //un livre peut apparyennir à pllusieurs catégories, une catégories peut  avoir pplusieurs livres
    @ManyToMany
    private List<Categorie> categories = new ArrayList<>();


    
   

    public Livre(Integer id, String titre, Auteur auteur, List<Categorie> categories) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.categories = categories;
    }

    public Auteur getAuteur() {
        return auteur;
    }



    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }



    public Livre() {
    }

  

    public Livre(String titre, Auteur auteur) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

   
    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", categories=" + categories + "]";
    }
   
}
