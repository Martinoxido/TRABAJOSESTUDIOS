package vista;
import java.util.Scanner;
import controlador.*;
public class Main
{
    public static void main(String args[])
    {
        boolean i=true;
        System.out.println("PRESIONA ENTER PARA EMPEZAR");
        Scanner key= new Scanner(System.in);
        key.nextLine();
        while (i==true){
            System.out.println("Opciones: \n1.suma\n2.resta\n3.Multiplicacion\n4.Division");
            int op=key.nextInt();
            switch(op){
                case 1:
                    Suma operador= new Suma();
                    operador.sumar();
                    break;
                case 2:
                    Resta operador2= new Resta();
                    operador2.restar();
                    break;
                case 3:
                    Multiplicacion operador3= new Multiplicacion();
                    operador3.Multiplicar();
                    break;
                case 4:
                    Div operador4= new Div();
                    operador4.Dividir();
                    break;
                case 5:
                    i=false;
                    break;
            }
        }
    }
}
