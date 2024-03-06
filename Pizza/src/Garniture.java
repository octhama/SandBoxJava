public class Garniture {
    public EGarniture nom;
    public double prix;
    public String description;

    public Garniture(EGarniture nom, double prix, String description) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
    }

    public EGarniture getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(EGarniture nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
