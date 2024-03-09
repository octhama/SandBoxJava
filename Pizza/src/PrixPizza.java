public class PrixPizza {
    public EPrixPizza typePrix;

    public PrixPizza(EPrixPizza typePrix) {
        this.typePrix = typePrix;
    }

    public EPrixPizza getTypePrix() {

        return typePrix;
    }

    @Override
    public String toString() {

        return typePrix.toString();
    }

}
