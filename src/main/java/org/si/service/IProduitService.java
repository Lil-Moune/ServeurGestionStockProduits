package org.si.service;

import java.util.List;

import org.si.entity.Produit;

public interface IProduitService {

    List<Produit> getProduits();

    void addProduit( Produit produit );

    void updateProduit( Produit produit );

    void deleteProduit( String ref );

}
