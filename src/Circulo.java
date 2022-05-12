public class Circulo extends Figura implements AccionesFiguraInterface{
    private double radio;

    public double getRadio() {
        return radio;}
    public void setRadio(double radio) {
        this.radio = radio;}


    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }
//implementar
     float pi=3.1416f;
    @Override
    public double obtenerArea() {
        return pi*(Math.pow(getRadio(),2));

    }

    @Override
    public double obtenerPerimetro() {
        return 2*pi*getRadio();
    }
//AccionesFiguraInterface
    @Override
    public void rellenar() {
        System.out.println("Rellenando figura");
    }

    @Override
    public void dupicar() {
        System.out.println("Ha duplicado la fgura");
    }

    @Override
    public Figura hacerPequenio() {
        Circulo circuloPeque= new Circulo(this.color,this.relleno,this.radio);
        return circuloPeque;
    }
}
