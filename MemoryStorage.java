import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryStorage {
    private Map<Integer, Object> storage;
    private int index;
    private Scanner scanner;

    public MemoryStorage() {
        this.storage = new HashMap<>();
        this.index = 1;
        this.scanner = new Scanner(System.in);
    }

    public void storeInput() {
        System.out.print("Digite um valor: ");
        String data = scanner.nextLine();
        storage.put(index++, data);
    }

    public void printStorage() {
        storage.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void closeScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        MemoryStorage memory = new MemoryStorage();
        
        for (int i = 0; i < 3; i++) {
            memory.storeInput();
        }
        
        memory.printStorage();
        memory.closeScanner();
    }
}
