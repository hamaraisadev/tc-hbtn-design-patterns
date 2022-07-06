public class WesterosPersonagemFactory extends PersonagemFactory {


    @Override
    public Personagem createPersonagem(TipoPersonagem01 tipo, String nome) {
        if(tipo == TipoPersonagem01.MAGO){
            return new Mago(nome, 8,3,3,3,4);
        }else if(tipo == TipoPersonagem01.LADRAO){
            return new Ladrao(nome,1,8,7,7,10);
        }else if(tipo == TipoPersonagem01.GUERREIRO){
            return new Guerreiro01(nome,0,9,7,10,7);
        }
        return null;
    }
}