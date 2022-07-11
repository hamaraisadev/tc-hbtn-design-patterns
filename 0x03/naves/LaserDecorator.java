

public class LaserDecorator extends NaveEspacialDecorator {

    public LaserDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}