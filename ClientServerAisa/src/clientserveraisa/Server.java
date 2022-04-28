/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserveraisa;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Server {
    ServerSocket ss;
    Socket so;
    BufferedReader br;
    
    public Server(int porta) 
    {
        try {
            ss = new ServerSocket(porta);
            System.out.println("il server e' in ascolto");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void inAscolto() {
        try {
            so=ss.accept();
            System.out.println("connessione avvenuta");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String Leggi()
    {
        String ritorno = "";
        try 
        {
             ritorno = br.readLine();
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ritorno ;
    }
}
