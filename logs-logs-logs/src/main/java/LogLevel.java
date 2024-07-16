public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("UNK", 0);

    private String acronym;
    private int number;

    LogLevel(String acronym, int number) {
        this.acronym = acronym;
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}