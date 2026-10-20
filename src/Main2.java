
interface MovementStrategy {
    String move();
}


class Walking implements MovementStrategy {
    @Override
    public String move() {
        return "Walking at 5 km/h";
    }
}

class Skateboarding implements MovementStrategy {
    @Override
    public String move() {
        return "Skateboarding at 15 km/h";
    }
}

class Jetpack implements MovementStrategy {
    @Override
    public String move() {
        return "Flying with a Jetpack at 60 km/h!";
    }
}


class Player {
    private MovementStrategy movementStrategy;


    public Player(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }


    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }


    public void move() {
        System.out.println("Player is " + movementStrategy.move());
    }
}


public class Main2 {
    public static void main(String[] args) {

        Player player = new Player(new Walking());
        player.move();


        player.setMovementStrategy(new Skateboarding());
        player.move();

        
        System.out.println("\n--- Player found a secret item! ---");
        player.setMovementStrategy(new Jetpack());
        player.move();
    }
}