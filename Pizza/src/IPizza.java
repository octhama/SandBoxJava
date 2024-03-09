public interface IPizza {
    void preparerLaPizza();
    void setPate(EPate pate);
    void setSauce(ESauce sauce);
    void setGarniture(EGarniture garniture);
    void setFromage(EFromage fromage);
    void setPrixPizza(EPrixPizza prixPizza);

    EPate getPate();
    ESauce getSauce();
    EGarniture getGarniture();
    EFromage getFromage();
    EPrixPizza getPrixPizza();

    default void setAll(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EPrixPizza prixPizza) {
        setPate(pate);
        setSauce(sauce);
        setGarniture(garniture);
        setFromage(fromage);
        setPrixPizza(prixPizza);
    }

    default void setAll(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EFromage fromage2, EFromage fromage3, EFromage fromage4, EPrixPizza prixPizza) {
        setPate(pate);
        setSauce(sauce);
        setGarniture(garniture);
        setFromage(fromage);
        setPrixPizza(prixPizza);
    }

    default void setAll(EPate pate, ESauce sauce, EGarniture garniture, EFromage fromage, EFromage fromage2, EFromage fromage3, EFromage fromage4, EFromage fromage5, EPrixPizza prixPizza) {
        setPate(pate);
        setSauce(sauce);
        setGarniture(garniture);
        setFromage(fromage);
        setPrixPizza(prixPizza);
    }

    default void pizzaOrdinaire() {
        System.out.println("Préparation de la pizza en cours...");
        System.out.println("Pizza en préparation...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza préparée avec : " + "une pâte " + getPate() + ", une sauce " + getSauce() + ", une garniture " + getGarniture() + ", un fromage " + getFromage() + " et qui coûte " + getPrixPizza());
        System.out.println("Pizza prête !");
    }

    void setPate(Pate pateFine);

    void setSauce(Sauce sauceSansGluten);

    void setPrixPizza(PrixPizza prixMoyen);
}
