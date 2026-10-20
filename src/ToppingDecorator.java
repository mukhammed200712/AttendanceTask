public class ToppingDecorator implements Pizza{
    protected Pizza pizza;
    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double getCost(){
        return pizza.getCost();
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
