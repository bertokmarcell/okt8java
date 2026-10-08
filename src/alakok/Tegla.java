package alakok;
public class Tegla extends Alakzat{
    public Tegla(double a, double b) {
        super(a,b);
    }
    public double kerulet(){
        return 2*(a+b);
    }
    
    public double terulet(){
        return a*b;
    }
}
