public class Quadrado implements FiguraGeometrica {
    private double lado;

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getLado(){
        return this.lado;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return this.lado+this.lado+this.lado+this.lado;
    }
    
    
}
