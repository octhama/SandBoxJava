public class PrixPizza {
    public EPrixPizza typePrix;

    public PrixPizza(EPrixPizza typePrix) {
        this.typePrix = typePrix;
    }

    public EPrixPizza getTypePrix() {
        return typePrix;
    }

    public void setTypePrix(EPrixPizza typePrix) {
        this.typePrix = typePrix;
    }

    @Override
    public String toString() {
        return typePrix.toString();
    }

    public void setPrixPizza(EPrixPizza typePrix) {
        this.typePrix = typePrix;
    }

    public void setPrixPizza(PrixPizza typePrix) {
        this.typePrix = typePrix.typePrix;
    }

    public double getPrixPizza() {
        return typePrix.getPrix();
    }

    public double getPrix() {
        return typePrix.getPrix();
    }

    public void setPrix(double prix) {
        typePrix.setPrix(prix);
    }

}
