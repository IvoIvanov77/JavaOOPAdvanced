package osp_lsp.exercises.models.loggers;

import osp_lsp.exercises.contracts.Appender;
import osp_lsp.exercises.enums.ReportLevel;

import java.util.Iterator;

public class MessageLogger extends AbstractLogger{


    public MessageLogger(Appender... appenders) {
        super(appenders);
    }

    @Override
    public void logError(String dateTime, String message) {
        for (Appender appender : appenders) {
            appender.appendMessage(dateTime, message, ReportLevel.ERROR);
        }
    }

    @Override
    public void logInfo(String dateTime, String message) {
        for (Appender appender : appenders) {
            appender.appendMessage(dateTime, message, ReportLevel.INFO);
        }

    }

    @Override
    public void logWarning(String dateTime, String message) {
        for (Appender appender : appenders) {
            appender.appendMessage(dateTime, message, ReportLevel.WARNING);
        }
    }

    @Override
    public void logCritical(String dateTime, String message) {
        for (Appender appender : appenders) {
            appender.appendMessage(dateTime, message, ReportLevel.CRITICAL);
        }
    }

    @Override
    public void logFatal(String dateTime, String message) {
        for (Appender appender : appenders) {
            appender.appendMessage(dateTime, message, ReportLevel.FATAL);
        }
    }

    @Override
    public Iterator<Appender> iterator() {
        return new Iterator<Appender>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < appenders.length;
            }

            @Override
            public Appender next() {
                return appenders[index ++];
            }
        };
    }
}
