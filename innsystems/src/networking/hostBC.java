/*
 * hostBC.java
 *
 * Created on February 24, 2007, 2:43 PM
 *
 *
 */

package networking;

import java.io.*;
import java.net.*;


/**
 * Class that creates a thread to listen for broadcast pings, store clientips
 * and return the server ip to the client then listen
 *
 * @author Alex Filby
 * @version 0.0.1 2/24/07
 */
public class hostBC implements Runnable {
    private static boolean listen;
    private byte[] serverip;
    private ServerSocket sock;
    private final int portListen = netComm.hostListen;
    
    public hostBC(byte[] serverip) {
        this.serverip = serverip;
        Thread t = new Thread(this);
        t.run();
    }
    
    public void run() {
        try{
            sock = new ServerSocket(portListen);
            listen = true;
            System.out.println("Host Listening on port 7776...");
        }catch(IOException e) {
            e.printStackTrace();
        }
        while(listen) {
            System.out.println("here");
            try {
                Socket s = sock.accept();
                // Pass socket to another class to deal with sending data back
                s.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        
    }
    
    public void stop() {
        listen = false;
        System.out.println("done");
    }
    
}
