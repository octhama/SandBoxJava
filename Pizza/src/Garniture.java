public class Garniture {
    public EGarniture nom;
    public double prix;
    public String description;

    public Garniture(EGarniture eGarniture) {
        this.nom = eGarniture;
        this.prix = 0.0;
        this.description = "";
    }

    public EGarniture getNom() {

        return nom;
    }
    @Override
    public String toString() {
        return "Garniture [nom=" + nom + ", prix=" + prix + ", description=" + description + "]";
    }

}
