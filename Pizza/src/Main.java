public class Main {
    public static void main(String[] args) {
        // Je veux une margarita
       Pizza pizza = new Pizza();
         pizza.setPate(EPate.FINE);
            pizza.setSauce(ESauce.TOMATE);
            pizza.setGarniture(EGarniture.JAMBON);
            pizza.setFromage(EFromage.MOZZARELLA);
            pizza.setPrixPizza(EPrixPizza.MOYENNE);
            pizza.create();

    }
}