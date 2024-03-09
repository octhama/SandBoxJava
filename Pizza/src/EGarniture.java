public enum EGarniture {
    ANCHOIS("Anchois", 2.0, "Garniture italienne"),
    CHAMPIGNONS("Champignons", 2.0, "Garniture italienne"),
    JAMBON("Jambon", 2.0, "Garniture italienne"),
    OIGNONS("Oignons", 2.0, "Garniture italienne"),
    POIVRONS("Poivrons", 2.0, "Garniture italienne"),
    TOMATE("Tomate", 2.0, "Garniture italienne"),
    MOZZARELLA("Mozzarella", 2.0, "Garniture italienne"),
    SALADE("Salade", 2.0, "Garniture italienne"),
    ITALIEN("Italien", 2.0, "Garniture italienne"),
    OLIVES("Olives", 2.0, "Garniture italienne"),
    LARDONS("Lardons", 2.0, "Garniture italienne"),
    PEPERONNI("Peperonni", 2.0, "Garniture italienne");

    private String nom;
    private double prix;
    private String description;
    EGarniture(String nom, double prix, String description) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
    }
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public String getDescription() {
        return description;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Garniture [nom=" + nom + ", prix=" + prix + ", description=" + description + "]";
    }
}
