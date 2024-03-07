public enum EPrixPizza {

    PETITE(6.5, "Petite"),
    MOYENNE(8.5, "Moyenne"),
    GRANDE(11.5, "Grande");

    private double prix;
    private String description;

    private EPrixPizza(double prix, String description) {
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
