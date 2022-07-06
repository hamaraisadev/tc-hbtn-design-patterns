public class TerraMediaPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem01 tipo, String nome) {
        if (tipo == TipoPersonagem01.MAGO) {
            return new Mago(nome, 10, 2, 5, 3, 4);
        } else if (tipo == TipoPersonagem01.LADRAO) {
            return new Ladrao(nome, 2, 6, 8, 5, 10);
        } else if (tipo == TipoPersonagem01.GUERREIRO) {
            return new Guerreiro01(nome, 1, 8,5,10,6);
        }
        return null;


    }
}