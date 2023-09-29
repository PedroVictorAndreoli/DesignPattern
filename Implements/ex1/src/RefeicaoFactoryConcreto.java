public class RefeicaoFactoryConcreto extends RefeicaoFactory{
    @Override
    protected Refeicao createRefeicao(String nome) {
        return switch (nome){
            case "FRANGO A PARMEGIANA"-> new FrangoParmegiana();
            case "PURE DE CAPIVARA"-> new PureCapivara();
            default -> null;
        };
    }
}
