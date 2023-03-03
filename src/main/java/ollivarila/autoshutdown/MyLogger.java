package ollivarila.autoshutdown;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class MyLogger {

    private static Logger logger;

    public static void setLogger(Logger lg) {
        logger = lg;
    }

    public static void log(Level level, String msg) {
        if(logger != null){
            logger.log(level, msg);
        } else {
            System.out.println(msg);
        }
    }
}
