import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandlerExample {
    private static final Logger LOGGER = Logger.getLogger(HandlerExample.class.getName());    
    public static void main(String[] args) {
        Handler consoleHandler, fileHandler;
        try {
            consoleHandler = new ConsoleHandler();             //Creating consoleHandler and fileHandler
            fileHandler = new FileHandler("./qait.log");
            //fileHandler.setFormatter(new SimpleFormatter()); 		//XMLFormatter()
            LOGGER.addHandler(consoleHandler); 	//Assigning handlers to LOGGER object
            LOGGER.addHandler(fileHandler);
            consoleHandler.setLevel(Level.ALL); 	//Setting levels to handlers and LOGGER
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);
            LOGGER.config("Configuration done.");
            LOGGER.removeHandler(consoleHandler);	 //Console handler removed
            LOGGER.log(Level.FINE, "Finer logged");
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
        LOGGER.finer("Finest example on LOGGER handler completed.");
    }
}

