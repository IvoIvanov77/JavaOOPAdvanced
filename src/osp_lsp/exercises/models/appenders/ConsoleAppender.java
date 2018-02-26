package osp_lsp.exercises.models.appenders;

import osp_lsp.exercises.contracts.Layout;
import osp_lsp.exercises.enums.ReportLevel;

public class ConsoleAppender extends AbstractAppender {


    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void appendMessage(String dateTime, String message, ReportLevel level) {
        if(level.compareTo(this.getLevel()) >= 0){
            System.out.println(this.getLayout().formatMessage(dateTime, message, level));
            super.messageCount ++;
        }
    }


}
