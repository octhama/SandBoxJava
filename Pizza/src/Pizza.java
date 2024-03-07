/**
 * Créer une classe pizza qui permet de faire des pizza à partir
 * 1) le type de pâte (en définir plusieurs)
 * 2) la garniture (idem)
 * 3) la sauce (idem)
 * 4) le fromage (idem)
 */
public class Pizza implements IPizza{

    public EPate pate;
    public ESauce sauce;
    public EGarniture garniture;
    public EFromage fromage;
    public EPrixPizza PrixPizza;

    public Pizza(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EPrixPizza PrixPizza) {
        this.pate = pate;
        this.sauce = sauce;
        this.garniture = garniture;
        this.fromage = fromage;
        this.PrixPizza = PrixPizza;
    }

    public Pizza() {
    }

    public void create() {
        System.out.println("Pizza préparée avec : " + "une pâte " + pate + ", une sauce " + sauce + ", une garniture " + garniture + ", un fromage " + fromage + " et qui coûte " + PrixPizza);
    }

    public EPate getPate() {
        return pate;
    }

    public ESauce getSauce() {
        return sauce;
    }

    public EGarniture getGarniture() {
        return garniture;
    }

    public EFromage getFromage() {
        return fromage;
    }

    public EPrixPizza getPrixPizza() {
        return PrixPizza;
    }


    public void setPate(EPate pate) {
        this.pate = pate;
    }

    public void setSauce(ESauce sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(EGarniture garniture) {
        this.garniture = garniture;
    }

    public void setFromage(EFromage fromage) {
        this.fromage = fromage;
    }

    public void setPrixPizza(EPrixPizza PrixPizza) {
        this.PrixPizza = PrixPizza;
    }

    public void setPate(Pate pateFine) {
        this.pate = pate;
    }

    @Override
    public void setSauce(Sauce sauceSansGluten) {
        this.sauce = sauce;
    }

    public void setPrixPizza(PrixPizza prixMoyen) {
        this.PrixPizza = PrixPizza;
    }
}
