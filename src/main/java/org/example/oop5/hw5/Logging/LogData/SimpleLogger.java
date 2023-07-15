package org.example.oop5.hw5.Logging.LogData;

import org.example.oop5.hw5.Interfaces.ILogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SimpleLogger implements ILogger {
    Logger logger;
    FileHandler fh;
    SimpleFormatter sFormat;

    public Logger getLog() throws IOException {
        this.logger = Logger.getAnonymousLogger();

        this.fh = new FileHandler("C:\\GB\\JAVA\\HW\\HW-1\\homeWork1\\src\\main\\java\\org\\example\\" +
                "oop5\\hw5\\Logging\\LogData\\logCalculator.txt");
        logger.addHandler(fh);

        return logger;
    }

    public void log(String myText) {
        this.sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(myText);
    }

    public void log(String className, String methodName, String message) {
        this.sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.logp(Level.INFO, className, methodName, message);
    }

}