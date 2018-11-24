package main.java.logger;

public enum LogLevel {
    INFO, WARNING, ERROR, CRITICAL, FATAL;

    @Override
    public String toString() {
        return this.name();
    }
}
