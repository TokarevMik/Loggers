package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        logger.info("here is info log. The Main log");
        logger.debug("here is info log. The Main log");
//        StatusPrinter.print(lc); //вызов внутреннего состояния logback
        Foo foo = new chapters.configuration.Foo();
        foo.doIt();
    }
}

