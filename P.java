public class P {

    private double vh;//Valor por hora
    private int hora;
    
    public P( double vh, int hora) {
        this.vh = vh;
        this.hora = hora;
    }

    public double Salario(double vh, int hora){
        
            double t = vh*hora;
            return t;
    }

    public double getvh() {
        return vh;
    }

    public int getHora() {
        return hora;
    }
 
    
}
