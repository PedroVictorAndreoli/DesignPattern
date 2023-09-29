public class RefeicaoFactoryConcreto extends RefeicaoFactory{
    @Override
    protected Refeicao createRefeicao(String nome) {
        return switch (nome){
            case "FRANGO A PARMEGIANA"-> new FrangoParmegiana();
            case "PURE DE CAPIVARA"-> new PureCapivara();
            case "SUCO DE UVA"-> new SucoDeUva();
            default -> null;
        };
    }
}
