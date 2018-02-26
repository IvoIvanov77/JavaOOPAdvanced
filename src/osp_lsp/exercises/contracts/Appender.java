package osp_lsp.exercises.contracts;

import osp_lsp.exercises.enums.ReportLevel;

public interface Appender {


    void appendMessage(String dateTime, String message, ReportLevel level);

    void setReportLevel(ReportLevel reportLevel);

    int getMessagesCount();
}
