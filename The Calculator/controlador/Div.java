package controlador;
import modelo.*;
import java.util.Scanner;

public class Div extends Calculadora
{
    public Div()
    {   
    }
    public void Dividir()
    {
        Scanner key= new Scanner(System.in);
        System.out.print("Ingrese Primer Valor: ");
        this.num1=key.nextDouble();
        System.out.print("Ingrese Segundo Valor: ");
        this.num2=key.nextDouble();
        
        if(this.num2==0){
            System.out.println("ERROR por X/0");
        }else{
        this.res=this.num1/this.num2;
        System.out.println(this.num1+"/"+this.num2+"="+this.res);
    }
    }
}