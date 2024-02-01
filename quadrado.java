class quadrado{
    private int lado;

    public quadrado(int lado){
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado*lado;
    }

    public static void main (String[] args){
        quadrado quadrado2 = new quadrado(4);
        System.out.println("lado: " + quadrado2.getLado());
        System.out.println("area: " + quadrado2.calcularArea());

    }
}