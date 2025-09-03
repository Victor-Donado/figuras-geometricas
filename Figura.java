abstract class Figura
{
    abstract double calcularArea();
    abstract double calcularPerimetro();
    
    public void mostrarInfo(){
        System.out.println("Figura: "+this.getClass().getSimpleName());
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
}