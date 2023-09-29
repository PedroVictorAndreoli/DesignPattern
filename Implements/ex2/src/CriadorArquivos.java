public class CriadorArquivos {
    private ICriarArquivo criar;

    public CriadorArquivos(ICriarArquivo criar){this.criar = criar;}
    public void mudarFormato(ICriarArquivo criar){this.criar = criar;}

    public void salvarArquivo(){criar.criar();}


}
