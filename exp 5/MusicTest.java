abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Striking the metal bars of the Glockenspiel with mallets.");
    }

    @Override
    void tune() {
        System.out.println("Adjusting the tension of the Glockenspiel support rails.");
    }
}

class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Drawing the bow across the Violin strings.");
    }

    @Override
    void tune() {
        System.out.println("Turning the pegs and fine-tuners to pitch the Violin strings.");
    }
}

public class MusicTest {
    public static void main(String[] args) {
        Instrument g = new Glockenspiel();
        Instrument v = new Violin();

        g.tune();
        g.play();
        
        System.out.println();

        v.tune();
        v.play();
    }
}