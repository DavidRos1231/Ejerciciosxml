package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class RPCClientEjercicio2 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client=new XmlRpcClient();
        Scanner entrada=new Scanner(System.in);
        client.setConfig(config);
        System.out.println("Ingrese primer numero");
        double num1=entrada.nextInt();
        System.out.println("Ingrese segundo numero");
        double num2= entrada.nextInt();
        System.out.println("Ingrese tercer numero");
        double num3=entrada.nextInt();
        System.out.println("Ingrese cuarto numero");
        double num4= entrada.nextInt();
        Object[] numeros={num1,num2,num3,num4};
        String response = (String) client.execute("Methods.operaciones",numeros);
        System.out.println(response);
    }
}