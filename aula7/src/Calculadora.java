public class Calculadora {

    private double Numero1;
    private double Numero2;


    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double numero1) {
        Numero1 = numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double numero2) {
        Numero2 = numero2;
    }

    //criar  o método para a adição
    public double Soma (){
        return(Numero1+Numero2);
    }

    //criar  o método para a subtração
    public double Subtrair (){
        return(Numero1-Numero2);
    }

    //criar  o método para a multiplicação
    public double Multiplicar (){
        return(Numero1*Numero2);
    }

    //criar  o método para a divisão
    public double Dividir (){
        return(Numero1/Numero2);
    }
}
