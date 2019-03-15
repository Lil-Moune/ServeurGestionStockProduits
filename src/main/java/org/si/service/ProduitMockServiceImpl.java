package org.si.service;

import java.util.ArrayList;
import java.util.List;

import org.si.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public class ProduitMockServiceImpl implements IProduitService {

    private List<Produit> produits;

    public ProduitMockServiceImpl() {
        produits = new ArrayList<Produit>();

        produits.add( new Produit( "Roman", 50, 20 ) );
        produits.add( new Produit( "Cahier", 200, 5.25f ) );
        produits.add( new Produit( "Stylo", 50, 2.10f ) );
    }

    @Override
    public List<Produit> getProduits() {
        // TODO Auto-generated method stub
        return produits;
    }

    @Override
    public void addProduit( Produit produit ) {
        // TODO Auto-generated method stub
        produits.add( produit );
    }

    @Override
    public void updateProduit( Produit produit ) {
        produits.remove( produit );
        produits.add( produit );
    }

    @Override
    public void deleteProduit( Long id ) {
        // TODO Auto-generated method stub
        Produit produit = new Produit();
        produit.setId( id );
        produits.remove( produit );
    }

}
