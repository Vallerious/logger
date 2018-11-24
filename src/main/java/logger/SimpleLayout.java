package main.java.logger;

public class SimpleLayout implements LogLayout {
    @Override
    public String formatMessage(String date, LogLevel logLevel, String message) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s - %s - %s%n", date, logLevel, message));

        return sb.toString();
    }
}
