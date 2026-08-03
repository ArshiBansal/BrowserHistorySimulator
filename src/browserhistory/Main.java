package browserhistory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowserHistory history = FileHandler.load();   // Load previous session if available

        System.out.println("========================================");
        System.out.println("     BROWSER HISTORY SIMULATOR");
        System.out.println("========================================");

        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter URL to visit: ");
                    String url = scanner.nextLine();
                    history.visit(url);
                    break;

                case "2":
                    history.back();
                    break;

                case "3":
                    history.forward();
                    break;

                case "4":
                    history.showCurrentPage();
                    break;

                case "5":
                    history.showBackHistory();
                    break;

                case "6":
                    history.showForwardHistory();
                    break;

                case "7":
                    history.clear();
                    break;

                case "8":
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    history.search(keyword);
                    break;

                case "9":
                    history.showTotalPagesVisited();
                    break;

                case "10":
                    FileHandler.save(history);
                    break;

                case "11":
                    history = FileHandler.load();
                    break;

                case "0":
                    // Auto-save before exit
                    FileHandler.save(history);
                    System.out.println("Thank you for using Browser History Simulator!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println(); // empty line for better readability
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("------------- MENU -------------");
        System.out.println("1.  Visit a new URL");
        System.out.println("2.  Go Back");
        System.out.println("3.  Go Forward");
        System.out.println("4.  Show Current Page");
        System.out.println("5.  Show Back History");
        System.out.println("6.  Show Forward History");
        System.out.println("7.  Clear Entire History");
        System.out.println("8.  Search History");
        System.out.println("9.  Show Total Pages Visited");
        System.out.println("10. Save History to File");
        System.out.println("11. Load History from File");
        System.out.println("0.  Exit (Auto-saves)");
        System.out.println("--------------------------------");
    }
}