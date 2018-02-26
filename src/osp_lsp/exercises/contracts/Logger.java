package osp_lsp.exercises.contracts;

public interface Logger extends Iterable<Appender>{

    void logError(String dateTime, String message);

    void logInfo(String dateTime, String message);

    void logWarning(String dateTime, String message);

    void logCritical(String dateTime, String message);

    void logFatal(String dateTime, String message);
}
