/**
 * Créer une classe pizza qui permet de faire des pizza à partir
 * 1) le type de pâte (en définir plusieurs)
 * 2) la garniture (idem)
 * 3) la sauce (idem)
 * 4) le fromage (idem)
 */
public class Pizza {

    public String pate;
    public String garniture;
    public String sauce;
    public String fromage;
    public String garniture3;
    public String fromage2;

    public Pizza(String pate, String garniture, String sauce, String fromage) {
        this.pate = pate;
        this.garniture = garniture;
        this.sauce = sauce;
        this.fromage = fromage;
    }


    public Pizza(Pate pate, Sauce sauce, Garniture garniture, Fromage fromage) {
        this.pate = pate.description;
        this.garniture = garniture.description;
        this.sauce = sauce.description;
        this.fromage = fromage.description;
    }

    public Pizza(Pate pate, Sauce sauce, Garniture garniture, Fromage fromage, Fromage fromage2) {
        this.pate = pate.description;
        this.garniture = garniture.description;
        this.sauce = sauce.description;
        this.fromage = fromage.description + " et " + fromage2.description;
    }

    public Pizza(Pate pate, Sauce sauce, Garniture garniture, Garniture garniture3, Fromage fromage, Fromage fromage2) {
        this.pate = pate.description;
        this.garniture = garniture.description + " et " + garniture3.description;
        this.sauce = sauce.description;
        this.fromage = fromage.description + " et " + fromage2.description;
    }
}
