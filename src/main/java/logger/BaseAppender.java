package main.java.logger;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public abstract class BaseAppender implements Appender {
    private LogLayout logLayout;
    private PrintWriter printWriter;
    private LogLevel minimumLogLevel;

    public BaseAppender(LogLayout logLayout, OutputStream outStream) {
        this.printWriter = new PrintWriter(outStream);
        this.logLayout = logLayout;
        this.minimumLogLevel = LogLevel.INFO;
    }

    @Override
    public void append(String date, LogLevel logLevel, String message) throws IOException {
        if (logLevel.ordinal() >= this.minimumLogLevel.ordinal()) {
            printWriter.append(this.logLayout.formatMessage(date, logLevel, message));
            printWriter.flush();
        }
    }

    @Override
    public void setReportLevel(LogLevel logLevel) {
        this.minimumLogLevel = logLevel;
    }
}
