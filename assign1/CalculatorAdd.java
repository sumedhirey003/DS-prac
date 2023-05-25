import java.rmi.*;
import java.rmi.server.*;

public class CalculatorAdd extends UnicastRemoteObject implements Calculator{
    CalculatorAdd() throws RemoteException{
        super();
    }

    public int add ( int num1, int num2) throws RemoteException{
        int sum = num1 + num2;
        return sum;
    } 
}
