package org.example.oop5.hw5;

import org.example.oop5.hw5.Base.ChoseModelFactory;
import org.example.oop5.hw5.Interfaces.ILogger;
import org.example.oop5.hw5.Logging.LogData.SimpleLogger;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        ILogger logger = new SimpleLogger();
        Presenter pres = new Presenter (new View(), new ChoseModelFactory(), logger);
        logger.getLog();
        logger.log(Program.class.getSimpleName(), "Main", "the program is started");

        pres.buttonClick();


        logger.log(Program.class.getSimpleName(), "Main","the program finished");
    }
}