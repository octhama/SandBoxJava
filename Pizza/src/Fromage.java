public class Fromage {
    public EFromage typefromage;
    public double prix;
    public String description;

    public Fromage(EFromage eFromage) {
        this.typefromage = eFromage;
        this.prix = 0.0;
        this.description = "";
    }

    public EFromage getTypefromage() {
        return typefromage;
    }

    @Override
    public String toString() {
        return "Fromage{" + "typefromage=" + typefromage + ", prix=" + prix + ", description=" + description + '}';
    }
}
