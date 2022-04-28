/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserveraisa;

/**
 *
 * @author Studente
 */
public class GestoreServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Server srv = new Server(2000);
        srv.inAscolto();
    }
    
}
