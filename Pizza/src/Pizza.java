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
    public ESauce sauce2;
    public ESauce sauce3;
    public ESauce sauce4;
    public ESauce sauce5;
    public EGarniture garniture;
    public EGarniture garniture2;
    public EGarniture garniture3;
    public EGarniture garniture4;
    public EGarniture garniture5;
    public EFromage fromage;
    public EFromage fromage2;
    public EFromage fromage3;
    public EFromage fromage4;
    public EPrixPizza PrixPizza;

    public Pizza() {
    }
    public Pizza(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EPrixPizza PrixPizza) {
        this.pate = pate;
        this.sauce = sauce;
        this.garniture = garniture;
        this.fromage = fromage;
        this.PrixPizza = PrixPizza;
    }

    // Pizza Quatre Fromages
    public Pizza(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage , EFromage fromage2, EFromage fromage3, EFromage fromage4, EPrixPizza PrixPizza) {
        this.pate = pate;
        this.sauce = sauce;
        this.garniture = garniture;
        this.fromage = fromage;
        this.fromage2 = fromage2;
        this.fromage3 = fromage3;
        this.fromage4 = fromage4;
        this.PrixPizza = PrixPizza;
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

    @Override
    public void setPate(Pate pateFine) {

    }

    @Override
    public void preparerLaPizza() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Préparation de la pizza en cours...");
        //timer
        System.out.println("Pizza en préparation...");
        try {
            Thread.sleep(5000);
            //decompte de 5 secondes
            for (int i = 5; i > 0; i--) {
                // affiche le décompte en pointillé uniquement
                System.out.print(".");
                // pause de 1 seconde
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza préparée avec : " + "une pâte " + pate + ", une sauce " + sauce + ", une garniture " + garniture + ", un fromage " + fromage + " et qui coûte " + PrixPizza);
        System.out.println("Pizza prête !");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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

    @Override
    public void setSauce(Sauce sauceSansGluten) {

        this.sauce = sauce;
    }

    @Override
    public void setPrixPizza(PrixPizza prixMoyen) {

        this.PrixPizza = PrixPizza;

    }
}
