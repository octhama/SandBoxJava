public enum EPrixPizza {

    MARGHERITA(6.0, "Tomate, mozzarella"),
    REGINA(7.0, "Tomate, jambon, champignons, mozzarella"),
    NAPOLITAINE(8.0, "Tomate, mozzarella, anchois"),
    CALZONE(8.5, "Tomate, mozzarella, jambon, champignons, œuf"),
    VEGETARIAN(8.5, "Tomate, mozzarella, oignons, poivrons, champignons"),
    FRAICHEUR(9.0, "Tomate, mozzarella, jambon, champignons, poivrons, artichauts, olives"),
    CHEVRE(9.0, "Tomate, fromage de chèvre, miel, noix, mozzarella"),
    RACLETTE(9.5, "Crème, mozzarella, pommes de terre, lardons, reblochon"),
    SAUMON(10.0, "Crème, mozzarella, saumon, câpres, oignons"),
    TARTIFLETTE(10.0, "Crème, mozzarella, pommes de terre, lardons, reblochon"),
    QUATREFROMAGES(10.0, "Tomate, mozzarella, chèvre, gorgonzola, emmental, roquefort"),
    ORIENTALE(10.0, "Tomate, mozzarella, merguez, poivrons, œuf"),
    CAMPAGNARDE(10.0, "Tomate, mozzarella, lardons, oignons, reblochon"),
    OCEANE(10.0, "Tomate, mozzarella, fruits de mer"),
    MEXICAINE(10.0, "Tomate, mozzarella, viande hachée, poivrons, piments, oignons"),
    INDIENNE(10.0, "Crème, mozzarella, poulet, curry, oignons, poivrons"),
    PAYSANNE(10.0, "Tomate, mozzarella, pommes de terre, lardons, oignons, reblochon"),
    FORESTIERE(10.0, "Crème, mozzarella, pommes de terre, lardons, oignons, reblochon, croûtons de chevre"),
    MOYENNE(10.0, "Tomate, mozzarella, jambon, champignons, mozzarella");

    EPrixPizza(double prix, String description){
        prix = prix;
        description = description;

    }
    private double prix;
    private String description;

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
