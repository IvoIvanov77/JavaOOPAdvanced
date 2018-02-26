package osp_lsp.exercises.models.layouts;

import osp_lsp.exercises.contracts.Layout;
import osp_lsp.exercises.enums.ReportLevel;

public class XmlLayout implements Layout {
    @Override
    public String formatMessage(String dateTime, String message, ReportLevel level) {
        return "<log>\n" +
                "\t<date>" + dateTime + "</date>\n" +
                "\t<level>" + level + "</level>\n" +
                "\t<message>" + message+  "</message>\n" +
                "</log>";
    }
}
