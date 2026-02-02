import java.io.*;
import java.util.Vector;

public class p1_br {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = new PrintStream(System.out);
        Vector<String> History = new Vector<>();

        int choice;

        do {
            p.println("\n--------- MENU ---------");
            p.println("1. Write Notes");
            p.println("2. Read Notes");
            p.println("3. Exit");
            p.println("-------------------------");
            p.print("Enter your choice: ");

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    p.println("\nEnter your notes (press Enter on empty line to stop):");
                    while (true) {
                        String note = br.readLine();
                        if (note == null || note.trim().isEmpty()) {
                            break;
                        }
                        History.add(note);
                    }
                    p.println("Notes saved successfully!");
                    break;

                case 2:
                    if (History.isEmpty()) {
                        p.println("No notes found!");
                    } else {
                        p.println("\nYour notes:");
                        for (int i = 0; i < History.size(); i++) {
                            p.println((i + 1) + ". " + History.get(i));
                        }
                    }
                    break;

                case 3:
                    p.println("Exiting program. Goodbye!");
                    break;

                default:
                    p.println("Invalid choice! Try again.");
            }

        } while (choice != 3);
    }
}
