//package org.example.oop6.hw51;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.logging.FileHandler;
//import java.util.logging.Handler;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;
//
//public class App {
//    public static final Logger logger = Logger.getLogger(Math.class.getName());
//    public static void main(String[] args) {
//        Presenter p = new Presenter(new SumModel(), new View(), new Logger(), new LogStrMaker());
//        p.buttonClick();
//        p.buttonClick();
//        p.buttonClick();
//        p.buttonClick();
//        try {
//            LogManager.getLogManager().readConfiguration(
//                    new FileInputStream("./src/main/java/org.example/oop5/hw5/logging.properties"));
//        } catch (IOException e) {
//            System.err.println("Could not setup logger configuration: " + e.toString());
//        }
//
//        Handler fileHandler = new FileHandler("./src/main/java/OOP_HW/Lesson_7/Client/Logs/log.txt");
//        logger.setUseParentHandlers(false);
//        logger.addHandler(fileHandler);
//        logger.info("Запуск приложения");
//
//        System.out.println("************************************************");
//        System.out.println("Добро пожаловать в программу Калькулятор");
//        ModuleLayer.Controller controller = new ModuleLayer.Controller();
//        controller.wait();
//    }
//
//}
