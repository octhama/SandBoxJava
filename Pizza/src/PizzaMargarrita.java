public class PizzaMargarrita extends Pizza{
    public PizzaMargarrita(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EPrixPizza prixPizza) {
        super(pate, sauce, garniture, fromage, prixPizza);
    }
    public void preparerLaPizza() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Préparation de la pizza en cours...");
        //timer
        System.out.println("Pizza en préparation...");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("Temps restant : " + (5 - i) + " secondes");
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza Margarrita préparée avec : " + "une pâte " + pate + ", une sauce " + sauce + ", une garniture " + garniture + ", un fromage " + fromage + " et qui coûte " + PrixPizza);
        System.out.println("Pizza prête !");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
