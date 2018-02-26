package osp_lsp.exercises.models.layouts;


import osp_lsp.exercises.enums.ReportLevel;
import osp_lsp.exercises.contracts.Layout;

public class SimpleLayout implements Layout {


//    ("3/26/2015 2:08:11 PM", "Error parsing JSON.");
//    "<date-time> - <report level> - <message>")

    @Override
    public String formatMessage(String dateTime, String message, ReportLevel level) {
        return String.format("%s - %s - %s", dateTime, level.name(), message);
    }
}
