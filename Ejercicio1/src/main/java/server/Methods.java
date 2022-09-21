package server;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public String datos(String name,double peso,double altura){
        double imc=peso/(altura*altura);
        return "Hola "+name+" tu IMC es: "+imc;
    }
    public int numeros(int num1, int num2){
        int contador=0;
        if (num1<num2){
            for (int i = num1+1; i < num2; i++) {
            contador=contador+i;
        }
        }else {
            for (int i = num2+1; i < num1; i++) {
                contador=contador+i;
        }
        }
        return contador;
    }
    public String operaciones(double num1, double num2,double num3, double num4){
        double producto=num1*num2*num3*num4;
        double suma=num1+num2+num3+num4;
        double promedio=suma/4;
        return "Hola, el producto es: "+producto+", la suma es: "+suma+", y el promedio es: "+promedio;
    }
    public Object[] acomodo(int num1,int num2,int num3,int num4,int num5){
        Object[] numeros={num1,num2,num3,num4,num5};
        Arrays.sort(numeros);
        return numeros;
    }
}
