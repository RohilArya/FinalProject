package sample;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by rohil on 05/04/17.
 */
public class ConnectionHandler {
        private Socket socket = null;
        private String hostname = null;
        private int port;

        public ConnectionHandler(String hostname, int port, Socket ClientSocket)
        {
            this.hostname = hostname;
            this.port = port;
            ClientSocket = socket;
            handleRequest();

        }

        public void handleRequest()
        {

        }
        public void run()
        {

        }
}
