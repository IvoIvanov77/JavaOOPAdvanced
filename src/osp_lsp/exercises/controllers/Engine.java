package osp_lsp.exercises.controllers;

import osp_lsp.exercises.contracts.Appender;
import osp_lsp.exercises.contracts.Controller;
import osp_lsp.exercises.contracts.Layout;
import osp_lsp.exercises.contracts.Logger;
import osp_lsp.exercises.enums.ReportLevel;
import osp_lsp.exercises.factories.AppenderFactory;
import osp_lsp.exercises.factories.LayoutFactory;
import osp_lsp.exercises.models.loggers.MessageLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Engine {

    private static Logger logger;
    private static Controller controller;

    private Engine() {

    }

//    ConsoleAppender SimpleLayout CRITICAL
//    FileAppender XmlLayout


    public static void execute() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Appender[] appenders = new Appender[n];

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String appenderType = input[0];
            String layoutType = input[1];
            Layout layout = LayoutFactory.createLayout(layoutType);
            Appender appender = AppenderFactory.createAppender(appenderType, layout);
            if(input.length > 2){
                appender.setReportLevel(ReportLevel.valueOf(input[2]));
            }
            appenders[i] = appender;
        }

        logger = new MessageLogger(appenders);
        controller = new LoggerController(logger);

        String line;
        while (true){
            if("END".equalsIgnoreCase(line = reader.readLine())){
                printAppenders();
                break;
            }
            controller.run(line);
        }

    }

    private static void printAppenders() {
        System.out.println("Logger info");
        for (Appender appender : logger) {
            System.out.println(appender);
        }
    }
}
