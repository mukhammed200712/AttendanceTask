
interface DigitalGame {
    void playDigital();
}


class ModernConsole {
    public void runGame(DigitalGame game) {
        System.out.print("[ModernConsole] ");
        game.playDigital();
    }
}


class RetroCartridge {
    private String title;

    public RetroCartridge(String title) {
        this.title = title;
    }

    public void insertCartridge() {
        System.out.println("Cartridge '" + title + "' inserted. Reading ROM... Game Started!");
    }
}


class CartridgeAdapter implements DigitalGame {
    private RetroCartridge cartridge;

    public CartridgeAdapter(RetroCartridge cartridge) {
        this.cartridge = cartridge;
    }

    @Override
    public void playDigital() {

        cartridge.insertCartridge();
    }
}


public class Main3 {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();

        RetroCartridge oldGame = new RetroCartridge("Super Mario Bros.");


        DigitalGame adaptedGame = new CartridgeAdapter(oldGame);


        console.runGame(adaptedGame);
    }
}