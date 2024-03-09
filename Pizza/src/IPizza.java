public interface IPizza {
    void create();
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

    void setPate(Pate pateFine);

    void setSauce(Sauce sauceSansGluten);

    void setPrixPizza(PrixPizza prixMoyen);
}
