package Java_Lectures.Lecture2_23nov;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class Example3 {
    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger(Example3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");



    }
}
