public class BebidaAdapter extends Refeicao{

    private Bebida bebida;

    public BebidaAdapter() {
    }

    @Override
    public double getPreco(){

        return bebida.preco;
    }
}
