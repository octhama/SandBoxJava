public enum EFromage {
    MOZZARELLA("Mozzarella", 2.0, "Fromage italien"),
    EMMENTALER("Emmental", 2.0, "Fromage suisse"),
    CHEDDAR("Cheddar", 2.0, "Fromage anglais"),
    CHEVRE("Chèvre", 2.0, "Fromage de chèvre"),
    PARMESAN("Parmesan", 2.0, "Fromage italien"),
    ROQUEFORT("Roquefort", 2.0, "Fromage français");

    private String nom;
    private double prix;
    private String description;

    EFromage(String nom, double prix, String description) {
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
        return "Fromage [nom=" + nom + ", prix=" + prix + ", description=" + description + "]";
    }
}
