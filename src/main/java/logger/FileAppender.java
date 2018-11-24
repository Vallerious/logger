package main.java.logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAppender extends BaseAppender {
    private static final String fileName = "log.txt";

    public FileAppender(LogLayout logLayout) throws FileNotFoundException {
        this(logLayout, new FileOutputStream(fileName, true));
    }

    public FileAppender(LogLayout logLayout, FileOutputStream fOut) {
        super(logLayout, fOut);
    }
}
