public enum EPrixPizza {
    PETITE(6.5),
    MOYENNE(8.5),
    GRANDE(11.5);

    public double prix;
    EPrixPizza(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String toString() {
        return "PrixPizza [prix=" + prix + "]";
    }
}
