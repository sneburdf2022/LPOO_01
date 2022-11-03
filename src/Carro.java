public class Carro {
    
    private String _marca;
    private String _modelo;
    private int _velocidade = 0;
    private int _velocidadeAtual=0;
    private int _somaVelocidade = 0;
    private int _reduzidoVelocidade= 0 ;

    public Carro(String Marca, String Modelo) {
        this._marca = Marca;
        this._modelo = Modelo;
    }
    
    private void AumentoVelocidade(int velocidadeAtual, int valor,int velocidade){
        System.out.println("A velocidade atual é " + velocidadeAtual + " Km/H");
        System.out.println("Valor aumentado é " + valor);
        System.out.println("Valor atualizado é " + velocidade);
    }
    private void DiminuirVelocidade(int velocidadeAtual, int valor,int velocidade){
        System.out.println("A velocidade atual é " + this._velocidadeAtual + " Km/H");
        System.out.println("Valor informado é " + valor);
        System.out.println("Valor atualizado é " + this._velocidade);
    }

    public void Acelerar(int valor) {
        this._velocidadeAtual = this._velocidade;
        this._somaVelocidade = this._velocidade + valor;
        if (_somaVelocidade >= 200) {
            this._velocidade = 200;
        } else {
            this._velocidade = _somaVelocidade;
        }
        AumentoVelocidade(this._velocidadeAtual, valor,this._velocidade);
        

    }
    

    public void Frear(int valor) {
        this._velocidadeAtual = this._velocidade;
        this._reduzidoVelocidade = this._velocidade - valor;
        if (this._reduzidoVelocidade <= 0) {
            this._velocidade = 0;
        } else {
            this._velocidade = this._reduzidoVelocidade;
        }
        DiminuirVelocidade(this._velocidadeAtual,valor,this._velocidade);

    }
    
    public void printStatus() {
        System.out.println("Carro [_marca=" + _marca + ", _modelo=" + _modelo + ", _velocidade=" + _velocidade + "]");
    }

}
