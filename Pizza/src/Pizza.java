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

    @Override
    public void create() {
        System.out.println("Pizza{" +
                "pate=" + pate +
                ", sauce=" + sauce +
                ", garniture=" + garniture +
                ", fromage=" + fromage +
                ", PrixPizza=" + PrixPizza +
                '}');
    }

    @Override
    public void setPate(EPate pate) {
        this.pate = pate;

    }

    @Override
    public void setSauce(ESauce sauce) {

    }

    @Override
    public void setGarniture(EGarniture garniture) {

    }

    @Override
    public void setFromage(EFromage fromage) {

    }

    @Override
    public void setPrixPizza(EPrixPizza prixPizza) {

    }

    @Override
    public EPate getPate() {
        return null;
    }

    @Override
    public ESauce getSauce() {
        return null;
    }

    @Override
    public EGarniture getGarniture() {
        return null;
    }

    @Override
    public EFromage getFromage() {
        return null;
    }

    @Override
    public EPrixPizza getPrixPizza() {
        return null;
    }

    @Override
    public void setAll(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EPrixPizza prixPizza) {
        IPizza.super.setAll(pate, sauce, garniture, fromage, prixPizza);
    }
}
