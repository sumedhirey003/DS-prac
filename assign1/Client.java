import java.rmi.*;
public class Client{
    public static void main(String args[]){
        try{
            Calculator remoteobj = (Calculator)Naming.lookup("rmi://localhost:1900/add");
            int result = remoteobj.add(20,10);
            System.out.println("Result of sum is:" + result);
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
}