

public class NaveEspacialDecorator extends NaveEspacial{

    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.naveDecorada = naveEspacial;

    }

    public int getSaude() {
        return naveDecorada.getSaude();
    }

    public int getAtaque() {
        return naveDecorada.getAtaque();
    }
}