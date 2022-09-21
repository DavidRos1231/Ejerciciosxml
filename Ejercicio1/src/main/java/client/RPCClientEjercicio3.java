package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class RPCClientEjercicio3 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client=new XmlRpcClient();
        Scanner entrada=new Scanner(System.in);
        client.setConfig(config);
        System.out.println("Ingrese primer numero");
        int num1=entrada.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2= entrada.nextInt();
        Object[] numeros={num1,num2};
        int response = (int) client.execute("Methods.numeros",numeros);
        System.out.println("La suma de cada numero entre "+num1+" y "+num2+" es "+response);
    }
}
