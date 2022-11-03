import java.util.Scanner;

public class ExercicioLPOO1 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Gostaria de ter marca de carro?");
        String marcaCarro = ler.nextLine();
        System.out.println("Gostaria de ter modelo de carro?");
        String modeloCarro = ler.nextLine();
        String comando = "";
        Carro carro = new Carro(marcaCarro, modeloCarro);
        int valorA = 0;
        int valorF = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Gostaria de ter acelerar o carro ou frear?(digite: acelerar, frear ou sair");
            comando = ler.nextLine();
            if(i==5){
                i--;
            }
            if(comando.equals("acelerar")){
                System.out.println("Digite um valor inteiro para aumentar a acelerração");
                valorA = ler.nextInt();
                carro.Acelerar(valorA);
            }else if(comando.equals("frear")){
                System.out.println("Digite um valor inteiro para diminuir a acelerração");
                valorF = ler.nextInt();
                carro.Frear(valorF);
            }else if(comando.equals("sair")){
                System.out.println("Obrigado por usar o program.");
                i=10;
                ler.close();
            }

        }
        
    }
}
