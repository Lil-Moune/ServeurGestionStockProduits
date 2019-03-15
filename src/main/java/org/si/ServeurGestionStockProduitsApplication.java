package org.si;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

    public static void main( String[] args ) {

        ConfigurableApplicationContext ctx = SpringApplication.run( ServeurGestionStockProduitsApplication.class,
                args );
        /*
         * ProduitRepository produitRepository = ctx.getBean(
         * ProduitRepository.class ); produitRepository.save( new Produit(
         * "Roman", 50, 20 ) ); produitRepository.save( new Produit( "Cahier",
         * 200, 5.25f ) ); produitRepository.save( new Produit( "Stylo", 50,
         * 2.10f ) );
         */
    }

}
