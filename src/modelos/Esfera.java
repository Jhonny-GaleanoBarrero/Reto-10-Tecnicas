package modelos;

public class Esfera implements IEsfera { //Cambiar el nombre a esfera
    private double a;

    public Esfera(int a){
        this.a = a;
    }

    @Override
    public Double volumen() {
        return  (((((a * a) * a) * Math.PI) * 4) / 3);
    }

    @Override
    public Double superficie() {
        return ((a * a) * Math.PI) * 4;
    }

    @Override
    public Double areaCirculo() {
        return (a * a) * Math.PI;
    }

    @Override
    public Double perimetroCirculo() {
        return ((a * 2) * Math.PI);
    }

    @Override
    public void setA(Double a) {

    }

    @Override
    public Double getA() {
        return null;
    }
}
