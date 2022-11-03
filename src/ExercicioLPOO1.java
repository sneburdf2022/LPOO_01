public class ExercicioLPOO1 {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("FIAT", "Palio");
        c1.printStatus();
        c1.Acelerar(20);
        c1.Acelerar(50);
        c1.Acelerar(200);
        c1.Frear(100);
        c1.Frear(150);
        c1.printStatus();
    }
}
