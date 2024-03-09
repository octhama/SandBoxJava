public class Sauce {
    public ESauce typeSauce;
    public double prix;
    public String description;


    public Sauce(ESauce eSauce) {
        this.typeSauce = eSauce;
        this.prix = 0.0;
        this.description = "";
    }

    public ESauce getTypeSauce() {

        return typeSauce;
    }

    @Override
    public String toString() {
        return "Sauce{" + "typeSauce=" + typeSauce + ", prix=" + prix + ", description=" + description + '}';
    }
}
