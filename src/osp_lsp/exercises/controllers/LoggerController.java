package osp_lsp.exercises.controllers;

import osp_lsp.exercises.contracts.Controller;
import osp_lsp.exercises.contracts.Logger;

public class LoggerController implements Controller{

    private Logger logger;

    public LoggerController(Logger logger) {
        this.logger = logger;
    }




    public void run(String line){
        String[] input = line.split("\\|");
        String level = input[0];
        String dateTime = input[1];
        String message = input[2];

        switch (level){
            case "INFO" : this.logger.logInfo(dateTime, message);
            break;
            case "WARNING" : this.logger.logWarning(dateTime, message);
                break;
            case "ERROR" : this.logger.logError(dateTime, message);
                break;
            case "CRITICAL" : this.logger.logCritical(dateTime, message);
                break;
            case "FATAL" : this.logger.logFatal(dateTime, message);
                break;
            default: throw new IllegalArgumentException("Invalid level type");
        }
    }
}
