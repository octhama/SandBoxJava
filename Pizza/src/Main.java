public class Main {
    public static void main(String[] args) {

        Pate pate = new Pate(EPate.Fine, 2.5, "Pate fine, base de la pizza");
        Sauce sauce = new Sauce(ESauce.Tomate, 1.5, "Sauce tomate, base de la pizza");
        Garniture garniture = new Garniture(EGarniture.Mozzarella, 2.0, "Mozzarella, fromage de la pizza");
        Garniture garniture3 = new Garniture(EGarniture.PEPERONNI, 2.0, "Cheddar, fromage de la pizza");
        Fromage fromage = new Fromage(EFromage.Emmental, 2.0, "Emmental, fromage de la pizza");
        Fromage fromage2 = new Fromage(EFromage.Roquefort, 2.0, "Roquefort, fromage de la pizza");

        Pizza pizza = new Pizza(pate, sauce, garniture, garniture3, fromage, fromage2);
        System.out.println(pizza.pate);
        System.out.println(pizza.sauce);
        System.out.println(pizza.garniture);
        System.out.println(pizza.garniture3);
        System.out.println(pizza.fromage);
        System.out.println(pizza.fromage2);

        Pizza pizza2 = new Pizza(pate, sauce, garniture, fromage);
        System.out.println(pizza2.pate);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.garniture);
        System.out.println(pizza2.fromage);
    }
}