package main.java.logger;

public interface LogLayout {
    String formatMessage(String date, LogLevel logLevel, String message);
}
