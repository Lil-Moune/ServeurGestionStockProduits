package org.si.controller;

import java.util.List;

import org.si.entity.Produit;
import org.si.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/produit" )
@CrossOrigin // Necessaire pour lier la partie client à la partie serveur de
             // l'application
public class ProduitController {

    @Autowired
    private IProduitService produitService;

    @GetMapping
    public List<Produit> getProduits() {
        return produitService.getProduits();
    }

    @PostMapping
    public void addProduit( @RequestBody Produit produit ) {
        produitService.addProduit( produit );
    }

    @PutMapping
    public void updateProduit( @RequestBody Produit produit ) {
        produitService.updateProduit( produit );
    }

    @DeleteMapping( "/{id}" )
    public void deleteProduit( @PathVariable Long id ) {
        System.out.println( id );
        produitService.deleteProduit( id );
    }
}
