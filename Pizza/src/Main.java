public class Main {
    public static void main(String[] args) {

         System.out.println("LISTE DES PIZZAS PREPAREES");

         Pizza pizza = new Pizza();
            pizza.setPate(new Pate(EPate.EPAISSE).getTypedepate());
            pizza.setSauce(new Sauce(ESauce.TOMATE).getTypeSauce());
            pizza.setGarniture(new Garniture(EGarniture.MOZZARELLA).getNom());
            pizza.setFromage(new Fromage(EFromage.ROQUEFORT).getTypefromage());
            pizza.setPrixPizza(new PrixPizza(EPrixPizza.GRANDE).getTypePrix());
            pizza.preparerLaPizza();
            System.out.println(pizza);

        Pizza pizza1 = new Pizza();
            pizza1.setPate(new Pate(EPate.SANSGLUTEN).getTypedepate());
            pizza1.setSauce(new Sauce(ESauce.BBQ).getTypeSauce());
            pizza1.setGarniture(new Garniture(EGarniture.LARDONS).getNom());
            pizza1.setFromage(new Fromage(EFromage.MOZZARELLA).getTypefromage());
            pizza1.setPrixPizza(new PrixPizza(EPrixPizza.MOYENNE).getTypePrix());
            pizza1.preparerLaPizza();
            System.out.println(pizza1);

            PizzaMargarrita pizzaMargarrita = new PizzaMargarrita(EPate.COMPLETE, ESauce.TOMATE, EGarniture.PEPERONNI, EFromage.MOZZARELLA, EPrixPizza.GRANDE);
            pizzaMargarrita.preparerLaPizza();
            System.out.println(pizzaMargarrita);

            Pizza4QuatreFromage pizza4QuatreFromage = new Pizza4QuatreFromage(EPate.FINE, ESauce.TOMATE, EGarniture.PEPERONNI, EFromage.EMMENTALER, EFromage.MOZZARELLA, EFromage.CHEVRE, EFromage.CHEDDAR, EPrixPizza.MOYENNE);
            pizza4QuatreFromage.preparerLaPizza();
            System.out.println(pizza4QuatreFromage);

    }
}