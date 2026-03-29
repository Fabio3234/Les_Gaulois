package village_gaulois;

import personnages.Gaulois;

public class village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public village(String nom, int nbVillageoisMax, Gaulois chef) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMax];
        this.chef = chef;
        // Correction ici : setvillage avec un v minuscule
        this.chef.setvillage(this);
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            // Correction ici : setvillage avec un v minuscule
            gaulois.setvillage(this);
            nbVillageois++;
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois < 1 || numVillageois > nbVillageois) {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
        return villageois[numVillageois - 1];
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println(villageois[i].getNom());
        }
    }

    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        // On utilise la classe village (minuscule)
        village villageObjet = new village("Village des Irréductibles", 30, abraracourcix);

        Gaulois asterix = new Gaulois("Astérix", 8);
        villageObjet.ajouterVillageois(asterix);
        
        Gaulois obelix = new Gaulois("Obélix", 25);
        villageObjet.ajouterVillageois(obelix);
        
        villageObjet.afficherVillageois();
        
        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);
        
        System.out.println("\n--- Présentations ---");
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
    }
}