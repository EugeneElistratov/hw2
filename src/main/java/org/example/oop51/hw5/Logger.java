package org.example.oop51.hw5;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    int x1, x2, y1, y2, calcVariant;
    String res;

    public void recordEvent(String value) {
        String logFile = "log.txt";
        String event = value;


        try(FileWriter writer = new FileWriter(logFile, true))
        {
            // запись всей строки
            String text = event;
            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}
