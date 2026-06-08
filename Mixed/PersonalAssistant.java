import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Hello! I am your Personal Assistant. How can I help you?");
        System.out.println("Commands: time, date, open notepad, open calculator, search, joke, exit");

        while (!exit) {
            System.out.print("\nYour command: ");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "time":
                    showTime();
                    break;

                case "date":
                    showDate();
                    break;

                case "open notepad":
                    openApplication("notepad");
                    break;

                case "open calculator":
                    openApplication("calc");
                    break;

                case "search":
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();
                    performSearch(query);
                    break;

                case "joke":
                    tellJoke();
                    break;

                case "exit":
                    System.out.println("Goodbye! Have a great day!");
                    exit = true;
                    break;

                default:
                    System.out.println("Sorry, I didn't understand that command.");
            }
        }

        scanner.close();
    }

    public static void showTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("The current time is: " + formatter.format(date));
    }

    public static void showDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        Date date = new Date();
        System.out.println("Today's date is: " + formatter.format(date));
    }

    public static void openApplication(String app) {
        try {
            Runtime.getRuntime().exec(app);
            System.out.println(app + " opened successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to open " + app);
        }
    }

    public static void performSearch(String query) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=" + query.replace(" ", "+")));
            System.out.println("Searching Google for: " + query);
        } catch (IOException | URISyntaxException e) {
            System.out.println("Error: Unable to perform the search.");
        }
    }

    public static void tellJoke() {
        String[] jokes = {
            "Why don't scientists trust atoms? Because they make up everything!",
            "Why did the scarecrow win an award? Because he was outstanding in his field!",
            "What do you call fake spaghetti? An impasta!"
        };
        int randomIndex = (int) (Math.random() * jokes.length);
        System.out.println("Here's a joke for you: " + jokes[randomIndex]);
    }
}
