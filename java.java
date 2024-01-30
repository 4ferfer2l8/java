// Definindo a classe "Carro"
class Carro {
    // Atributos da classe
    private String Marca; // Atributo privado para encapsulamento
    private int Ano;   // Atributo privado para encapsulamento
    private String Modelo; // Atributo privado para encapsulamento
    private String Cor; // Atributo privado para encapsulamento
    private int Velocidade; // Atributo privado para encapsulamento
    
    // Método construtor da classe para inicializar os atributos
    Carro(String Marca, String Modelo, String Cor, int Ano, int Velocidade) {
        this.Marca = Marca;
        this.Ano = Ano;
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.Velocidade = Velocidade;
    }
    
    // Método getter para obter a marca do carro
    public String getMarca() {
        return Marca;
    }
    
    // Método getter para obter o ano do carro
    public int getAno() {
        return Ano;
    }

    // Método getter para obter o modelo do carro
    public String getModelo() {
        return Modelo;
    }

    // Método getter para obter a cor do carro
    public String getCor() {
        return Cor;
    }

    // Método getter para obter a velocidade do carro
    public String getVelocidade() {
        return Velocidade;
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro chamada "carro1"
        Carro carro1 = new Carro("Ford", 2023, "Maverick", "Amarelo", 70);
        
        // Usando os métodos getters para obter e imprimir as informações do carro
        System.out.println("Marca: " + carro1.getMarca()); // Obtém e imprime a marca do carro
        System.out.println("Ano: " + carro1.getAno()); // Obtém e imprime o ano do carro
        System.out.println("Modelo: " + carro1.getModelo()); // Obtém e imprime o modelo do carro
        System.out.println("Cor: " + carro1.getCor()); // Obtém e imprime a cor do carro
        System.out.println("Velocidade: " + carro1.getVelocidade()); // Obtém e imprime a velocidade do carro
    }
}