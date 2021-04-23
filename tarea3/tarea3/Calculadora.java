
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    private double a;
    private double b;
    private double c;
    
     public String ecuacion2Grado(double a,double b,double c){
        double x1,x2;
        String resultado;
        x1=(-b+Math.sqrt((b*b)-4*a*c))/2*a;
        x2=(-b-Math.sqrt((b*b)-4*a*c))/2*a;
        resultado="X1="+x1+"X2="+x2;
        return resultado;
    }
  
    public double calcularCatetoFaltante (double cat, double hip){
        double catetoFaltante;
        catetoFaltante = Math.sqrt(Math.pow(hip,2) - Math.pow(cat,2));
        return catetoFaltante;
    }
    
    public String ecuacionDeLaRecta(Punto uno, Punto dos){
        double m;
        String ecuacion;
        double parteX;
        double parteY;
        m = (dos.getY() - uno.getY()) / (dos.getX() - uno.getX());
        parteY = -(uno.getY());
        parteX = -(uno.getX());
        ecuacion = "Y = " + m + "X " + " + "+ (m * parteX + parteY * (-1));
        return ecuacion;
    }
}