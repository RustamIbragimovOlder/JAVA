package Java_Lectures.Lecture2_23nov;

// import java.io.IOException;
import java.util.logging.*;

public class Example3 {
    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger(Example3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}
