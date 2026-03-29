package personnages;

import village_gaulois.village;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;
    private village monVillage;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void setvillage(village v) {
        this.monVillage = v;
    }

    public void boirePotion(int forcePotion) {
        this.effetPotion = forcePotion;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + texte);
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }

    public void sePresenter() {
        if (monVillage != null) {
            if (monVillage.getChef() == this) {
                parler("\"Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + monVillage.getNom() + ".\"");
            } else {
                parler("\"Bonjour, je m'appelle " + nom + ". J'habite le village " + monVillage.getNom() + ".\"");
            }
        } else {
            parler("\"Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.\"");
        }
    }

    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        int forceDuCoup = (force / 3) * effetPotion;
        romain.recevoirCoup(forceDuCoup);
    }

    @Override
    public String toString() {
        return nom;
    }
}