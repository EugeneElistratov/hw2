package org.example.oop6.hw6.Interfaces;

import java.io.IOException;
import java.util.logging.Logger;

public interface ILogger {
    Logger getLog () throws IOException;
    void log(String myText);
    void log(String string, String string2, String string3);
}