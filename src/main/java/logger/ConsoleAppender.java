package main.java.logger;

public class ConsoleAppender extends BaseAppender {
    public ConsoleAppender(LogLayout logLayout) {
        super(logLayout, System.out);
    }
}
