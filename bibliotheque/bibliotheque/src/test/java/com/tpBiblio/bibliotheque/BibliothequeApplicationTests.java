package com.tpBiblio.bibliotheque;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tpBiblio.bibliotheque.entity.Auteur;
import com.tpBiblio.bibliotheque.entity.Categorie;
import com.tpBiblio.bibliotheque.entity.Livre;
import com.tpBiblio.bibliotheque.repository.AuteurRepository;
import com.tpBiblio.bibliotheque.repository.CategorieRepository;
import com.tpBiblio.bibliotheque.repository.LivreRepository;

@SpringBootTest
class BibliothequeApplicationTests {

	@Autowired
	AuteurRepository auteurRepository;

	@Autowired
	LivreRepository livreRepository;

	@Autowired
	CategorieRepository categorieRepository;

	@Test
	void saveAuteur() {

		Auteur stephenKing = new Auteur("stephen", "KING");
		auteurRepository.save(stephenKing);

	}

	@Test
	void saveLivre() {

		Livre dixpetitsnegres = new Livre();
		dixpetitsnegres.setTitre("Dix petits negres");
		livreRepository.save(dixpetitsnegres);

	}

	@Test
	void saveCategorie() {

		Categorie horreur = new Categorie();
		horreur.setNom("Horreur");
		categorieRepository.save(horreur);

	}

	
}
