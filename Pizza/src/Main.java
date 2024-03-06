public class Main {
    public static void main(String[] args) {

        Pate pate = new Pate(EPate.Fine, 2.5, "Pate fine, base de la pizza");
        Sauce sauce = new Sauce(ESauce.Tomate, 1.5, "Sauce tomate, base de la pizza");
        Garniture garniture = new Garniture(EGarniture.Mozzarella, 2.0, "Mozzarella, fromage de la pizza");

        Pizza pizza = new Pizza(pate, sauce, garniture);

        System.out.println(pizza);
    }
}