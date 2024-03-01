package Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author Ali
 */
public class Client_Sever {
    public static void main(String[] arg){
        try{
            Socket s = new Socket("localhost", 3304);
            System.out.println("Connected Successfully...");
            
            PrintStream pr = new PrintStream(s.getOutputStream());
            System.out.println("Enter Something: ");
            
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(rd);
            
            String temp = br.readLine();
            pr.println(temp);
            
            BufferedReader gt =  new BufferedReader(new InputStreamReader(s.getInputStream()));
            String tm = gt.readLine();
            System.out.println(tm);
        }
        catch(UnknownHostException e){
            System.out.println("IP not found for socket"+e);
        }
        catch(IOException e){
            System.out.println("Not found data for socket"+e);
        }
    }
    
}
