class Bola{
    private String Cor;

    public Bola(String Cor){
        this.Cor = Cor;
    }
    
    public String getCor(){
        return Cor;
    }

    public void setCor(String Cor){
        this.Cor = Cor;
    }

public static void main(String[] args) {
    Bola minhaBola = new Bola("vermelho");
    System.out.println("Cor da bola: " + minhaBola.getCor());

    minhaBola.setCor("azul");
    System.out.println("Nova cor da bola: " + minhaBola.getCor());
}
}
