public class PizzaMargarrita extends Pizza{
    public PizzaMargarrita(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EPrixPizza prixPizza) {
        super(pate, sauce, garniture, fromage, prixPizza);
    }
    public void create() {
        System.out.println("Pizza Margarrita préparée avec : " + "une pâte " + pate + ", une sauce " + sauce + ", une garniture " + garniture + ", un fromage " + fromage + " et qui coûte " + PrixPizza);
    }
}
