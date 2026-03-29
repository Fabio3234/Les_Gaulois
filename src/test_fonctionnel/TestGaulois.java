package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 25);
        Druide panoramix = new Druide("Panoramix", 5, 10);
        Romain minus = new Romain("Minus", 6);

        panoramix.preparerPotion();
        panoramix.booster(obelix);
        panoramix.booster(asterix);

        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");
        
        asterix.frapper(minus);
    }
}