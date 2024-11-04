package com.wejdene.produits.service;

import java.util.List;

import com.wejdene.produits.dto.ProduitDTO;
import com.wejdene.produits.entities.Categorie;
import com.wejdene.produits.entities.Produit;

public interface ProduitService {
	ProduitDTO saveProduit(ProduitDTO p);
	ProduitDTO updateProduit(ProduitDTO p);
	
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	
	ProduitDTO getProduit(Long id);
	List<ProduitDTO> getAllProduits();
	
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	List<Produit> findByNomPrix (String nom, Double prix);
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();
	
	ProduitDTO convertEntityToDto(Produit p);
	Produit convertDtoToEntity(ProduitDTO produitDto);
}
