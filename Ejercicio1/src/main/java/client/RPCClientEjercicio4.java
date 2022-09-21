package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.util.Arrays;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class RPCClientEjercicio4 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client=new XmlRpcClient();
        Scanner entrada=new Scanner(System.in);
        client.setConfig(config);
        Object numeros[]=new Object[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese un numero");
            numeros[i]=entrada.nextInt();
        }
        Object[] response = (Object[]) client.execute("Methods.acomodo",numeros);
        System.out.println(Arrays.toString(response));
    }
}
