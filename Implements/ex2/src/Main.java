public class Main {
    public static void main(String[] args) {
        CriadorArquivos criador =
                new CriadorArquivos((new CSV()));
        criador.salvarArquivo();
        criador.mudarFormato(new JSON());
        criador.salvarArquivo();
        criador.mudarFormato(new XML());
        criador.salvarArquivo();
    }
}