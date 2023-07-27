package com.tpBiblio.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tpBiblio.bibliotheque.entity.Auteur;
import com.tpBiblio.bibliotheque.entity.Categorie;
import com.tpBiblio.bibliotheque.entity.Livre;
import com.tpBiblio.bibliotheque.service.BiblioServ;



@RestController
public class BiblioController {

    @Autowired
    BiblioServ biblioServ;

    @PostMapping("categorie")
    public void postCategorie( @RequestBody Categorie newcategorie){
     biblioServ.addCategorie(newcategorie);

    }

    @PostMapping("auteur")
    public void postAuteur( @RequestBody Auteur newauteur){
        biblioServ.addAuteur(newauteur);
    }

    @PostMapping("livre")
    public void postLivre( @RequestBody Livre newlivre){
        biblioServ.addLivre(newlivre);
    }

    @GetMapping("livre")
    public List<Livre> getLivres(){
        return biblioServ.getLivres();
    }







    
}
