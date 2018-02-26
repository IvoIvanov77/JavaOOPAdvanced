package osp_lsp.exercises.contracts;

import osp_lsp.exercises.enums.ReportLevel;

public interface Layout {

    String formatMessage(String dateTime, String message, ReportLevel level);
}
