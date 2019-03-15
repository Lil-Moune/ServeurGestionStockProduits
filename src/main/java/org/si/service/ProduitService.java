package org.si.service;

import java.util.List;

import org.si.dao.ProduitRepository;
import org.si.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary /*
          * ceci est ajouter pour indiquer à java que ce service est prioritaire
          * parcequ'on a un autre service : le mockservice
          */
public class ProduitService implements IProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getProduits() {

        return produitRepository.findAll();
    }

    @Override
    public void addProduit( Produit produit ) {
        produitRepository.save( produit );

    }

    @Override
    public void updateProduit( Produit produit ) {
        // TODO Auto-generated method stub
        produitRepository.save( produit );
    }

    @Override
    public void deleteProduit( Long id ) {
        Produit produit = new Produit();
        produit.setId( id );
        produitRepository.delete( produit );
    }

}
