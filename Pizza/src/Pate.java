public class Pate {
    public EPate typedepate;
    public double prix;
    public String description;

    public Pate(EPate typedepate, double prix, String description) {
        this.typedepate = typedepate;
        this.prix = prix;
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
