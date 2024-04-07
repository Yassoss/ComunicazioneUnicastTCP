import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meddiki Yassine
 */
public class Server {
    int nPorta;
    ServerSocket serverSocket;
    Socket socket;
    public Server(int nPorta){
        this.nPorta = nPorta;
    }
    
    public Socket attendi(){
        socket = null;
        
        try {
            serverSocket = new ServerSocket(nPorta);
            System.out.println("1) Il Server è in ascolto!");
            socket = serverSocket.accept();
            System.out.println("2)Il Client ha fatto richiesta e la connessione è avvenuta!");
        } catch (BindException ex){
            System.err.println("Porta già in uso!");
        } catch (IOException ex) {
            System.err.println("Errore nella fase di ascolto del Server!");
        }
        return socket;
    }
    
    public void scrivi(){}
    
    public void leggi(){}
    
    public void chiudi(){
        try {
            clientSocket.close();
            System.out.println("Chiusura connessione con il Client avvenuta");
        } catch (IOException ex) {
            System.err.println("Errore nella chiusura della connessione con il Client");
        }
    }
    
    public void termina(){
        try {
            serverSocket.close();
            System.out.println("L'applicazione è stata chiusa correttamente!");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}