package main.java.logger;

import java.io.IOException;

public interface Appender {
    void append(String date, LogLevel logLevel, String message) throws IOException;

    void setReportLevel(LogLevel logLevel);
}
