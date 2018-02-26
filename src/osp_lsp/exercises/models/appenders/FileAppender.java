package osp_lsp.exercises.models.appenders;

import osp_lsp.exercises.contracts.File;
import osp_lsp.exercises.contracts.Layout;
import osp_lsp.exercises.enums.ReportLevel;
import osp_lsp.exercises.models.files.LogFile;

public class FileAppender extends AbstractAppender {

    private final File DEFAULT_FILE = new LogFile();

    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = DEFAULT_FILE;
    }

    @Override
    public void appendMessage(String dateTime, String message, ReportLevel level) {
        if(level.compareTo(this.getLevel()) >= 0) {
            this.file.write(this.getLayout().formatMessage(dateTime, message, level));
            super.messageCount ++;
        }
    }

    public void setFile(File file) {
        this.file = file;
    }


//    Appender type: FileAppender, Layout type: XmlLayout, Report level: INFO, Messages appended: 5, File size: 37526
    @Override
    public String toString() {
        return String.format("%s, File size: %d", super.toString(), this.file.getSize());
    }
}
