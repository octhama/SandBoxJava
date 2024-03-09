public class Main {
    public static void main(String[] args) {
         System.out.println("LISTE DES PIZZAS PREPAREES");

         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         Pizza pizza = new Pizza();
            pizza.setPate(new Pate(EPate.EPAISSE).getTypedepate());
            pizza.setSauce(new Sauce(ESauce.TOMATE).getTypeSauce());
            pizza.setGarniture(new Garniture(EGarniture.MOZZARELLA).getNom());
            pizza.setFromage(new Fromage(EFromage.ROQUEFORT).getTypefromage());
            pizza.setPrixPizza(new PrixPizza(EPrixPizza.GRANDE).getTypePrix());
            pizza.create();
            System.out.println(pizza);

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            PizzaMargarrita pizzaMargarrita = new PizzaMargarrita(EPate.COMPLETE, ESauce.TOMATE, EGarniture.PEPERONNI, EFromage.ROQUEFORT, EPrixPizza.GRANDE);
            pizzaMargarrita.create();
            System.out.println(pizzaMargarrita);

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Pizza4QuatreFromage pizza4QuatreFromage = new Pizza4QuatreFromage(EPate.FINE, ESauce.TOMATE, EGarniture.PEPERONNI, EFromage.EMMENTALER, EFromage.MOZZARELLA, EFromage.CHEVRE, EFromage.CHEDDAR, EPrixPizza.MOYENNE);
            pizza4QuatreFromage.create();
            System.out.println(pizza4QuatreFromage);
    }
}