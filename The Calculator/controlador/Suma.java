package controlador;
import modelo.*;
import java.util.Scanner;

public class Suma extends Calculadora
{
    public Suma()
    {   
    }
    public void sumar()
    {
        Scanner key= new Scanner(System.in);
        System.out.print("Ingrese Primer Valor: ");
        this.num1=key.nextDouble();
        System.out.print("Ingrese Segundo Valor: ");
        this.num2=key.nextDouble();
        this.res=this.num1+this.num2;
        System.out.println(this.num1+"+"+this.num2+"="+this.res);
    }
}
