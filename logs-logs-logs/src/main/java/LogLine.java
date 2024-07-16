public class LogLine {

    private final String acronym;
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
        this.acronym = logLine.substring(1,4); 
    }

    public LogLevel getLogLevel() {
        return switch (acronym) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        int number = getLogLevel().getNumber();
        return String.format("%d:%s", number, this.logLine.split(": ")[1]);
    }
}