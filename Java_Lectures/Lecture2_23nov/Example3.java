package Java_Lectures.Lecture2_23nov;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class Example3 {
    public static void main(String[] args) {
        // Логирование
        // Логи содержат системную информацию работы программного или аппаратного комплекса.
        // В них  записываются действия разного приоритета от  пользователя, или программного продукта.
        // Процесс ведения логов называют “логированием” (журналированием).

        // Логирование. Использование. Основы
        // Использование
        // Logger logger = Logger.getLogger()

        // Уровни важности
        // INFO, DEBUG, ERROR, WARNING и др.
        
        // Вывод
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);

        // Формат вывода: структурированный, абы как*
        // XMLFormatter, SimpleFormatter

        // например:
        Logger logger = Logger.getLogger(Ex0043.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");



    }
}
