public class Triangulo extends Figura
{
    private double lado1, lado2, lado3;
    
    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    
    public double calcularArea(){
        double x = (lado1+lado2+lado3)/2;
        return Math.sqrt(x*(x-lado1)*(x-lado2)*(x-lado3));
    }
    
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
}