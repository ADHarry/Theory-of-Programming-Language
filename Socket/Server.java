/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Socket;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
/**
 *
 * @author Ali
 */
public class Server {
    public static void main(String[] arg){
        try{
            ServerSocket ss = new ServerSocket(3304);
            Socket s = ss.accept();
            Socket st = ss.accept();
            System.out.println("Request Accepted...");
            
            BufferedReader bs = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
            String tmp = bs.readLine();
            String tm = br.readLine();
            System.out.println("I recived from client 1... "+tmp);
            System.out.println("I recived from client 2... "+tm);
            
            PrintStream pr = new PrintStream(s.getOutputStream());
            PrintStream pm = new PrintStream(st.getOutputStream());
            String str = "Yes I got it !!";
            pr.println(str);
            pm.println(str);
            
            s.close();
            ss.close();
            st.close();
        }
        catch(Exception e){
            System.out.println("Not found data for socket"+e);
        }
    }
    
}
