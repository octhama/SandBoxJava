public class Pate {
    public EPate typedepate;
    public double prix;
    public String description;

    public Pate(EPate ePate) {
        this.typedepate = ePate;
        this.prix = 0.0;
        this.description = "";
    }
    public EPate getTypedepate() {

        return typedepate;
    }

    @Override
    public String toString() {
        return "Pate{" + "typedepate=" + typedepate + ", prix=" + prix + ", description=" + description + '}';
    }

}
