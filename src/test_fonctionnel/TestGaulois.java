package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain; 
import personnages.Druide;
import personnages.Chaudron;

public class TestGaulois {

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
        asterix.parler("Oui très bonne idée.");

        Romain minus = new Romain("Minus", 6);
        System.out.println("\nDans la forêt " + asterix + " et " + obelix + " tombent nez à nez sur le romain " + minus + ".");
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }

        System.out.println("\n--- Arrivée de Panoramix ---");
        Druide panoramix = new Druide("Panoramix", 2);
        
        panoramix.fabriquerPotion(3, 10);
        
        panoramix.booster(obelix); 
        
        panoramix.booster(asterix);
        
        System.out.println("\n--- Deuxième Bagarre ---");
        asterix.frapper(minus); 
    }
}