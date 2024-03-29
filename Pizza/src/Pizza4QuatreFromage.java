public class Pizza4QuatreFromage extends Pizza{
    public Pizza4QuatreFromage(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EFromage fromage2, EFromage fromage3, EFromage fromage4, EPrixPizza prixPizza) {
        super(pate, sauce, garniture, fromage, fromage2, fromage3, fromage4, prixPizza);
    }
    public void preparerLaPizza() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Préparation de la pizza en cours...");
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
        System.out.println("Pizza 4 Fromages préparée avec : " + "une pâte " + pate + ", une sauce " + sauce + ", une garniture " + garniture + ", un fromage " + fromage + ", un fromage " + fromage2 + ", un fromage " + fromage3 + ", un fromage " + fromage4 + " et qui coûte " + PrixPizza);
        System.out.println("Pizza prête !");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
