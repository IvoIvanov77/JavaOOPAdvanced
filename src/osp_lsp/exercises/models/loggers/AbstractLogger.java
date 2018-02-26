package osp_lsp.exercises.models.loggers;

import osp_lsp.exercises.contracts.Appender;
import osp_lsp.exercises.contracts.Logger;

import java.util.Iterator;

public abstract class AbstractLogger implements Logger{

    protected Appender[] appenders;

    public AbstractLogger(Appender... appenders) {
        this.appenders = appenders;
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
