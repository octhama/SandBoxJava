public class Fromage {
    public EFromage typefromage;
    public double prix;
    public String description;

    public Fromage(EFromage typefromage, double prix, String description) {
        this.typefromage = typefromage;
        this.prix = prix;
        this.description = description;
    }

    public EFromage getTypefromage() {
        return typefromage;
    }
    public void setTypefromage(EFromage typefromage) {
        this.typefromage = typefromage;
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

}
