public class Rectangulo extends Figura
{
    private double base, altura;
    
    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    
    public double calcularArea(){
        return base*altura/2;
    }
    
    public double calcularPerimetro(){
        return 2*(base+altura);
    }
}