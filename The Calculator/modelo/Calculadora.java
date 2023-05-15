package modelo;

public class Calculadora
{
    protected double num1;
    protected double num2;
    protected double res;
    public Calculadora()
    { 
    }    
    public double get(String x){
        if(x=="num1"){
            return this.num1;
        }
        else if(x=="num2"){
            return this.num2;
        }
        else if(x=="res"){
            return this.res;
        }
        else{return 0;}
    }
    public void set(String x, double y){
        if(x=="num1"){
            this.num1=y;
        }
        else if(x=="num2"){
            this.num2=y;
        }
        else if(x=="res"){
            this.res=y;
        }
        else{System.out.print ("error seteo");}
    }
    }
    

