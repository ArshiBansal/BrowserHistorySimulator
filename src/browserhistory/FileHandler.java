package browserhistory;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class FileHandler {

    private static final String FILE_PATH = "data/history.dat";

    // Feature 11: Save history to file
    public static void save(BrowserHistory history) {
        // Create data folder if it doesn't exist
        File dataDir = new File("data");
        if (!dataDir.exists()) {
            dataDir.mkdirs();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(history);
            System.out.println("History saved successfully to " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error while saving history: " + e.getMessage());
        }
    }

    // Feature 11: Load history from file
    public static BrowserHistory load() {
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("No saved history found. Starting with empty history.");
            return new BrowserHistory();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            BrowserHistory history = (BrowserHistory) ois.readObject();
            System.out.println("History loaded successfully from " + FILE_PATH);
            return history;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while loading history: " + e.getMessage());
            System.out.println("Starting with empty history.");
            return new BrowserHistory();
        }
    }
}