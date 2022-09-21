package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class RPCClientEjercicio1 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client=new XmlRpcClient();
        Scanner entrada=new Scanner(System.in);
        client.setConfig(config);
        System.out.println("Ingrese nombre");
        String name=entrada.nextLine();
        System.out.println("Ingrese altura");
        double altura= entrada.nextDouble();
        System.out.println("Ingrese peso");
        double peso= entrada.nextDouble();
        Object[] datos={name,peso,altura};
        String response = (String) client.execute("Methods.datos",datos);
        System.out.println(response);
    }
}
