public class Guerreiro01 extends Personagem{

    public Guerreiro01(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem01.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);

        if(forca <= inteligencia || forca <= destreza) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (super.getForca() * 0.8) + (super.getVigor() * 0.05) + (super.getDestreza() * 0.1) + (super.getInteligencia() * 0.05);
    }
}