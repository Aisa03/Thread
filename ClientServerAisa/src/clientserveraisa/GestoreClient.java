/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserveraisa;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class GestoreClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            Client str = cli;
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
