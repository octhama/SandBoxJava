public class Main {
    public static void main(String[] args) {
       Pizza pizza = new Pizza();
            pizza.setPate(new Pate(EPate.FINE, 4.0, "Pate fine").getTypedepate());
            pizza.setSauce(new Sauce(ESauce.TOMATE, 2.0, "Sauce tomate").getTypeSauce());
            pizza.setGarniture(new Garniture(EGarniture.MOZZARELLA, 3.0, "Mozzarella").getNom());
            pizza.setFromage(new Fromage(EFromage.ROQUEFORT, 5.0, "Roquefort").getTypefromage());
            pizza.setPrixPizza(new PrixPizza(EPrixPizza.GRANDE, 12.0, "Grande").getTypePrix());
            pizza.create();
            System.out.println(pizza);
    }
}