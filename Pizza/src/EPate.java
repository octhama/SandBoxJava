public enum EPate {
    FINE(4.0, "Pate fine"),
    EPAISSE(5.0, "Pate epaisse"),
    COMPLETE(6.0, "Pate complete"),
    SANSGLUTEN(7.0, "Pate sans gluten");

    public double prix;
    public String description;
    EPate(double prix, String description) {
        this.prix = prix;
        this.description = description;
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
    public String toString() {
        return "Pate{" + "prix=" + prix + ", description=" + description + '}';
    }
    public EPate setPate(EPate pate) {
        this.prix = pate.prix;
        this.description = pate.description;
        return this;
    }
    public EPate getPate() {
        return this;
    }
    public String toStringPate() {
        return "Pate [prix=" + prix + ", description=" + description + "]";
    }

    public String toStringPate(EPate ePate) {
        return "Pate [prix=" + ePate.prix + ", description=" + ePate.description + "]";
    }
}
