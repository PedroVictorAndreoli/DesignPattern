public class Main {
    public static void main(String[] args) {
        RefeicaoFactory fabrica = new RefeicaoFactoryConcreto();
        System.out.println("Frago a Parmegiana");
        Refeicao g = fabrica.calcularPreco("FRANGO A PARMEGIANA");
        System.out.println(g.getPreco());

        System.out.println("Pure de Capivara");
        Refeicao t = fabrica.calcularPreco("PURE DE CAPIVARA");
        System.out.println(t.getPreco());

        //No restaurante a bebida e cortesia, entao a classe Bebida
        //nao possui o metodo getPreco()
        //Foi necessario criar um adapter para colocar a funcao getPreco()
        System.out.println("Suco de Uva");
        Refeicao h = fabrica.calcularPreco("SUCO DE UVA");
        System.out.println(h.getPreco());


    }
}