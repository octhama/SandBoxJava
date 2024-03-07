public class PrixPizza {
    public EPrixPizza typePrix;
    public double prix;
    public String description;

    public PrixPizza(EPrixPizza typePrix, double prix, String description) {
        this.typePrix = typePrix;
        this.prix = prix;
        this.description = description;
    }

    public EPrixPizza getTypePrix() {
        return typePrix;
    }

    public void setTypePrix(EPrixPizza typePrix) {
        this.typePrix = typePrix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "PrixPizza [description=" + description + ", prix=" + prix + ", typePrix=" + typePrix + "]";
    }
}
