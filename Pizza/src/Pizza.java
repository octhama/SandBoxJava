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

    public Pizza(String pate, String garniture, String sauce, String fromage) {
        this.pate = pate;
        this.garniture = garniture;
        this.sauce = sauce;
        this.fromage = fromage;
    }

    public Pizza(Pate pate, Sauce sauce, Garniture garniture) {
        this.pate = pate.description;
        this.garniture = garniture.description;
        this.sauce = sauce.description;
        this.fromage = garniture.description;
    }
}
