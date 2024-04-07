import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
/*import java.util.logging.Level;
import java.util.logging.Logger;
*/

/**
 *
 * @author Meddiki Yassine
 */
public class Client {
    String nomeDefault;
    String coloreDefault;
    Socket s;
    
    public Client(String nomeDefault, String coloreDefault){
        this.nomeDefault=nomeDefault;
        this.coloreDefault=coloreDefault;
    }
    
    public void connetti(String nomeServer, int nPorta){
        try{
            s = new Socket(nomeServer, nPorta);
            System.out.println("Il Client ha richiesto una connessione");
        }catch(UnknownHostException ue){
            System.err.println("Errore DNS");
        }catch (IOException ex) {
            System.err.println("Errore nella comunicazione");
        }
    }        
    public void scrivi(){
    
    }
    
    public void leggi(){
        
    }
    
    public void chiudi(){
        try {
            s.close();
            System.out.println("Il Client ha chiuso la comunicazione con il Server");
        } catch (IOException ex) {
            System.err.println("Errore nella fase di chiusura della connessione");
        }
    }   
}