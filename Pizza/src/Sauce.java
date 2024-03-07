public class Sauce {
    public ESauce typeSauce;
    public double prix;
    public String description;

    public Sauce(ESauce typeSauce, double prix, String description) {
        this.typeSauce = typeSauce;
        this.prix = prix;
        this.description = description;
    }

    public ESauce getTypeSauce() {
        return typeSauce;
    }

    public void setTypeSauce(ESauce typeSauce) {
        this.typeSauce = typeSauce;
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

    public Sauce setSauce(Sauce sauce) {
        this.typeSauce = sauce.typeSauce;
        this.prix = sauce.prix;
        this.description = sauce.description;
        return this;
    }
    @Override
    public String toString() {
        return "Sauce{" + "typeSauce=" + typeSauce + ", prix=" + prix + ", description=" + description + '}';
    }
}
