public abstract class RefeicaoFactory {

   protected abstract Refeicao createRefeicao(String nome);

    public Refeicao calcularPreco(String nome) {
        Refeicao Refeicao = createRefeicao(nome);
        return Refeicao;
    }
}
