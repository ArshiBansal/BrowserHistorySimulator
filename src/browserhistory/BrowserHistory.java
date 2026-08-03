package browserhistory;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BrowserHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int MAX_HISTORY_SIZE = 50;   // Feature 8

    private Deque<Page> backStack;
    private Deque<Page> forwardStack;
    private Page currentPage;
    private int totalPagesVisited;                   // Feature 10

    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
        totalPagesVisited = 0;
    }

    // Feature 1: Visit a new URL
    public void visit(String url) {
        if (url == null || url.trim().isEmpty()) {
            System.out.println("Invalid URL!");
            return;
        }

        // If there is a current page, push it to backStack
        if (currentPage != null) {
            backStack.push(currentPage);
        }

        // Clear forward history (real browser behaviour)
        forwardStack.clear();

        // Set new current page
        currentPage = new Page(url.trim());
        totalPagesVisited++;

        // Feature 8: Enforce size limit
        enforceSizeLimit();

        System.out.println("Visited: " + currentPage);
    }

    // Feature 2: Go Back
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No previous page in history.");
            return;
        }

        // Move current to forward
        forwardStack.push(currentPage);

        // Move previous to current
        currentPage = backStack.pop();

        System.out.println("Moved Back → " + currentPage);
    }

    // Feature 3: Go Forward
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward page available.");
            return;
        }

        // Move current to back
        backStack.push(currentPage);

        // Move next to current
        currentPage = forwardStack.pop();

        System.out.println("Moved Forward → " + currentPage);
    }

    // Feature 4: Show Current Page
    public void showCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page is currently open.");
        } else {
            System.out.println("Current Page: " + currentPage);
        }
    }

    // Feature 5: Display full Back History
    public void showBackHistory() {
        if (backStack.isEmpty()) {
            System.out.println("Back history is empty.");
            return;
        }

        System.out.println("\n----- Back History -----");
        int index = 1;
        // We create a temporary list because Deque iteration order is LIFO
        List<Page> temp = new ArrayList<>(backStack);
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.println(index++ + ". " + temp.get(i));
        }
        System.out.println("------------------------\n");
    }

    // Feature 6: Display full Forward History
    public void showForwardHistory() {
        if (forwardStack.isEmpty()) {
            System.out.println("Forward history is empty.");
            return;
        }

        System.out.println("\n----- Forward History -----");
        int index = 1;
        List<Page> temp = new ArrayList<>(forwardStack);
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.println(index++ + ". " + temp.get(i));
        }
        System.out.println("---------------------------\n");
    }

    // Feature 7: Clear entire history
    public void clear() {
        backStack.clear();
        forwardStack.clear();
        currentPage = null;
        // Note: totalPagesVisited is NOT reset (historical count)
        System.out.println("History cleared successfully.");
    }

    // Feature 9: Search history by keyword
    public void search(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            System.out.println("Please enter a valid keyword.");
            return;
        }

        keyword = keyword.toLowerCase().trim();
        List<Page> results = new ArrayList<>();

        // Search back stack
        for (Page page : backStack) {
            if (page.getUrl().toLowerCase().contains(keyword)) {
                results.add(page);
            }
        }

        // Search current page
        if (currentPage != null && currentPage.getUrl().toLowerCase().contains(keyword)) {
            results.add(currentPage);
        }

        // Search forward stack
        for (Page page : forwardStack) {
            if (page.getUrl().toLowerCase().contains(keyword)) {
                results.add(page);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No matching pages found for: \"" + keyword + "\"");
        } else {
            System.out.println("\n----- Search Results for \"" + keyword + "\" -----");
            int index = 1;
            for (Page page : results) {
                System.out.println(index++ + ". " + page);
            }
            System.out.println("------------------------------------------\n");
        }
    }

    // Feature 10: Show total pages visited
    public void showTotalPagesVisited() {
        System.out.println("Total pages visited in this session: " + totalPagesVisited);
    }

    // Helper: Enforce maximum history size (Feature 8)
    private void enforceSizeLimit() {
        // Total size = back + current + forward
        while (backStack.size() + forwardStack.size() + (currentPage != null ? 1 : 0) > MAX_HISTORY_SIZE) {
            if (!backStack.isEmpty()) {
                // Remove the oldest page (from the bottom of backStack)
                // ArrayDeque doesn't have direct removeLast efficiently for this use-case,
                // so we convert temporarily
                List<Page> temp = new ArrayList<>(backStack);
                temp.remove(temp.size() - 1); // remove oldest
                backStack.clear();
                backStack.addAll(temp);
            } else {
                break; // safety
            }
        }
    }

    // Getters needed by FileHandler
    public Deque<Page> getBackStack() {
        return backStack;
    }

    public Deque<Page> getForwardStack() {
        return forwardStack;
    }

    public Page getCurrentPage() {
        return currentPage;
    }

    public int getTotalPagesVisited() {
        return totalPagesVisited;
    }

    // Setters needed when loading from file
    public void setBackStack(Deque<Page> backStack) {
        this.backStack = backStack;
    }

    public void setForwardStack(Deque<Page> forwardStack) {
        this.forwardStack = forwardStack;
    }

    public void setCurrentPage(Page currentPage) {
        this.currentPage = currentPage;
    }

    public void setTotalPagesVisited(int totalPagesVisited) {
        this.totalPagesVisited = totalPagesVisited;
    }
}