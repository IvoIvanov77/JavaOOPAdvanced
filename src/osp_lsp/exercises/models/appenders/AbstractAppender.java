package osp_lsp.exercises.models.appenders;

import osp_lsp.exercises.contracts.Appender;
import osp_lsp.exercises.contracts.Layout;
import osp_lsp.exercises.enums.ReportLevel;

public abstract class AbstractAppender implements Appender{

    private final static ReportLevel DEFAULT_LEVEL = ReportLevel.INFO;
    private Layout layout;
    private ReportLevel level;
    protected int messageCount;

    public AbstractAppender(Layout layout) {
        this.layout = layout;
        this.level = DEFAULT_LEVEL;
        this.messageCount = 0;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.level = reportLevel;
    }

    @Override
    public int getMessagesCount() {
        return this.messageCount;
    }

    protected ReportLevel getLevel() {
        return level;
    }

    protected Layout getLayout() {
        return layout;
    }

//    Appender type: ConsoleAppender, Layout type: SimpleLayout, Report level: CRITICAL, Messages appended: 2
    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(), this.getLayout().getClass().getSimpleName(),
                this.getLevel().name(), this.getMessagesCount());
    }
}
