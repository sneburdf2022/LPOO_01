public class Carro {
    private String _marca;
    private String _modelo;
    private int _velocidade = 0;

    public Carro(String Marca, String Modelo) {
        _marca = Marca;
        _modelo = Modelo;
    }

    public void Acelerar(int valor) {
        int velocidadeAtual = _velocidade;
        int somaVelocidade = _velocidade + valor;
        if (somaVelocidade >= 200) {
            _velocidade = 200;
        } else {
            _velocidade = somaVelocidade;
        }
        System.out.println("A velocidade atual é " + velocidadeAtual + " Km/H");
        System.out.println("Valor aumentado é " + valor);
        System.out.println("Valor atualizado é " + _velocidade);

    }

    public void Frear(int valor) {
        int velocidadeAtual = _velocidade;
        int reduzidoVelocidade = _velocidade - valor;
        if (reduzidoVelocidade <= 0) {
            _velocidade = 0;
        } else {
            _velocidade = reduzidoVelocidade;
        }
        System.out.println("A velocidade atual é " + velocidadeAtual + " Km/H");
        System.out.println("Valor informado é " + valor);
        System.out.println("Valor atualizado é " + _velocidade);

    }
    
    public void printStatus() {
        System.out.println("Carro [_marca=" + _marca + ", _modelo=" + _modelo + ", _velocidade=" + _velocidade + "]");
    }

}
