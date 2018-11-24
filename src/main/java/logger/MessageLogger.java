package main.java.logger;

import java.io.IOException;

public class MessageLogger implements Logger {
    private Appender appender;

    public MessageLogger(Appender appender) {
        this.appender = appender;
    }

    @Override
    public void logInfo(String date, String message) throws IOException {
        this.appender.append(date, LogLevel.INFO, message);
    }

    @Override
    public void logWarning(String date, String message) throws IOException {
        this.appender.append(date, LogLevel.WARNING, message);
    }

    @Override
    public void logError(String date, String message) throws IOException {
        this.appender.append(date, LogLevel.ERROR, message);
    }

    @Override
    public void logCritical(String date, String message) throws IOException {
        this.appender.append(date, LogLevel.CRITICAL, message);
    }

    @Override
    public void logFatal(String date, String message) throws IOException {
        this.appender.append(date, LogLevel.FATAL, message);
    }
}
