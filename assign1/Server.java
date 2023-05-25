import java.rmi.*;
import java.rmi.registry.*;

public class Server{
    public static void main(String args[]){
        try{
            Calculator remoteobj = new CalculatorAdd();
            LocateRegistry.createRegistry(1900);

            Naming.rebind("rmi://localhost:1900/add", remoteobj);
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
}