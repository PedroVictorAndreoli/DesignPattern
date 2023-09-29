public class Main {
    public static void main(String[] args) {
        Sansung sansung = new Sansung();
        Xiaomi xiaomi = new Xiaomi();

        xiaomi.TirarFotoFrontal();
        xiaomi.TirarFotoTraseira();

        sansung.TirarFotoFrontal();
        sansung.TirarFotoTraseira();

    }
}