public class Sansung implements ICamera{
    @Override
    public void TirarFotoFrontal() {
        System.out.println("Sansung: foto frontal tirada");
    }

    public Sansung() {
    }

    @Override
    public void TirarFotoTraseira() {
        System.out.println("Sansung: foto traseira tirada");
    }
}
