public class GuerreiroBuilder implements Builder {

    private String nome;
    private int forca;
    private TipoPersonagem01 tipo;
    private int inteligencia;
    private int vigor;
    private int resistencia;
    private int destreza;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setTipo(TipoPersonagem01 tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Guerreiro01 build() {
        return new Guerreiro01(nome, inteligencia, forca, vigor, resistencia, destreza);

    }

}
