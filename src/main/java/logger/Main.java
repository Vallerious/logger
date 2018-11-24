package main.java.logger;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LogLayout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        consoleAppender.setReportLevel(LogLevel.WARNING);
        Logger myLogger = new MessageLogger(consoleAppender);

        myLogger.logError("3/26/2018 2:03:33 PM", "Error parsing XML.");
        myLogger.logWarning("3/26/2018 2:03:55 PM", "We are approaching memory limits.");
    }
}
