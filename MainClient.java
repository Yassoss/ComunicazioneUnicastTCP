/*import java.io.*;
import java.net.*;
*/

/**
 *
 * @author Meddiki Yassine
 */
public class MainClient {

    public static void main(String[] args) {
        Client c = new Client("Yasso","Arancione");
        c.connetti("127.0.0.1",2000);
        c.chiudi();
    }
}