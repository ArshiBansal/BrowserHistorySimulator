package browserhistory;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Page implements Serializable {
    private static final long serialVersionUID = 1L;

    private String url;
    private LocalDateTime timestamp;

    public Page(String url) {
        this.url = url;
        this.timestamp = LocalDateTime.now();
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        return timestamp.format(formatter);
    }

    @Override
    public String toString() {
        return url + "  [" + getFormattedTimestamp() + "]";
    }
}