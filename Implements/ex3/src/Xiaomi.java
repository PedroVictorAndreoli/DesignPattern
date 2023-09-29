public class Xiaomi implements ICamera{
    @Override
    public void TirarFotoFrontal() {
        System.out.println("Xiaomi: foto frontal tirada");
    }

    public Xiaomi() {
    }

    @Override
    public void TirarFotoTraseira() {
        System.out.println("Xiaomi: foto traseira tirada");
    }

}
