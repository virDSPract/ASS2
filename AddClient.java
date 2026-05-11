package RMI;

import java.rmi.*;


public class AddClient {
	public static void main(String[] args) {
	try {
		AddServerIntf addObAddServerIntf = (AddServerIntf)Naming.lookup("rmi://127.0.0.1/AddServer");
		
		double num1 = 10;
		double num2 = 20;
		
		double result = addObAddServerIntf.add(num1, num2);
		
		System.out.println("Addition Result = "+ result);
	}
	catch(Exception e) {
		e.printStackTrace();
	}}
}