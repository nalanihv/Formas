public class Rectangulo extends Figura{
    private double ancho;
    private double alto;


    public double getAncho() {
        return ancho;}
    public void setAncho(double ancho) {
        this.ancho = ancho;}

    public double getAlto() {
        return alto;}
    public void setAlto(double alto) {
        this.alto = alto;}

    public Rectangulo(String color, boolean relleno, double ancho, double alto) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double obtenerArea() {
        //implementar

        return getAlto()*getAncho();
    }

    @Override
    public double obtenerPerimetro() {
        return  (2*getAncho())+(2*getAlto());
    }
}
