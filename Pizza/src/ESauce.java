public enum ESauce {
    TOMATE("Sauce tomate", 2.0),
    CREME("Sauce creme", 2.0),
    PESTO("Sauce pesto", 2.0),
    BBQ("Sauce BBQ", 2.0),
    SaucePiquante("Sauce piquante", 2.0),;

    private String typeSauce;
    private double prix;

    ESauce(String typeSauce, double prix) {
        this.typeSauce = typeSauce;
        this.prix = prix;
    }
    public String getTypeSauce() {
        return typeSauce;
    }
    public double getPrix() {
        return prix;
    }
    public void setTypeSauce(String typeSauce) {
        this.typeSauce = typeSauce;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String toString() {
        return "Sauce [typeSauce=" + typeSauce + ", prix=" + prix + "]";
    }
    public ESauce setSauce(ESauce sauce) {
        this.typeSauce = sauce.typeSauce;
        this.prix = sauce.prix;
        return this;
    }
    public ESauce setSauce(String typeSauce, double prix) {
        this.typeSauce = typeSauce;
        this.prix = prix;
        return this;
    }
    public ESauce setSauce(String typeSauce) {
        this.typeSauce = typeSauce;
        return this;
    }
    public ESauce setSauce(double prix) {
        this.prix = prix;
        return this;
    }
    public ESauce setSauce() {
        return this;
    }
    public double getPrixSauce() {
        return prix;
    }
    public void setPrixSauce(double prix) {
        this.prix = prix;
    }
    public String getTypeSauceSauce() {
        return typeSauce;
    }
    public void setTypeSauceSauce(String typeSauce) {
        this.typeSauce = typeSauce;
    }
    public String toStringSauce() {
        return "Sauce [typeSauce=" + typeSauce + ", prix=" + prix + "]";
    }
    public ESauce setSauceSauce(ESauce sauce) {
        this.typeSauce = sauce.typeSauce;
        this.prix = sauce.prix;
        return this;
    }
    public ESauce setSauceSauce(String typeSauce, double prix) {
        this.typeSauce = typeSauce;
        this.prix = prix;
        return this;
    }
    public ESauce setSauceSauce(String typeSauce) {
        this.typeSauce = typeSauce;
        return this;
    }
    public ESauce setSauceSauce(double prix) {
        this.prix = prix;
        return this;
    }
    public ESauce setSauceSauce() {
        return this;
    }
    public double getPrixSauceSauce() {
        return prix;
    }
    public void setPrixSauceSauce(double prix) {
        this.prix = prix;
    }
}
