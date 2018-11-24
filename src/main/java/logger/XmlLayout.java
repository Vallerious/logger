package main.java.logger;

public class XmlLayout implements LogLayout {
    @Override
    public String formatMessage(String date, LogLevel logLevel, String message) {
        StringBuilder sb = new StringBuilder();

        return sb.append("<log>\n\t<date>")
                .append(date)
                .append("</date>\n\t<level>")
                .append(logLevel)
                .append("</level>\n\t<message>")
                .append(message)
                .append("</message>\n</log>\n").toString();
    }
}
