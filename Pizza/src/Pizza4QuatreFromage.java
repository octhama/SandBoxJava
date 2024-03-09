public class Pizza4QuatreFromage extends Pizza{
    public Pizza4QuatreFromage(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EFromage fromage2, EFromage fromage3, EFromage fromage4, EPrixPizza prixPizza) {
        super(pate, sauce, garniture, fromage, fromage2, fromage3, fromage4, prixPizza);
    }
    public void create() {
        System.out.println("Pizza 4 Fromages préparée avec : " + "une pâte " + pate + ", une sauce " + sauce + ", une garniture " + garniture + ", un fromage " + fromage + ", un fromage " + fromage2 + ", un fromage " + fromage3 + ", un fromage " + fromage4 + " et qui coûte " + PrixPizza);
    }
}
