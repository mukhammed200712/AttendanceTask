public class Main {
    public static void main(String[] args) {
        Pizza customPizza = new Pineapple(new Olives(new Cheese(new PlainPizza())));


        System.out.println("Description: " + customPizza.getDescription());
        System.out.println("Total Cost: $" + customPizza.getCost());
    }
}