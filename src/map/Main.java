package map;

import java.util.*;

public class Main {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        while (phoneBook.getEntries().size() < 20) {
            phoneBook.addPhone(getRandomName(), getPhoneNumber());
        }
        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "Значение: 5");
        orderedMap.put(3, "Значение: 3");
        orderedMap.put(4, "Значение: 4");
        orderedMap.put(1, "Значение: 1");
        orderedMap.put(7, "Значение: 7");
        orderedMap.put(2, "Значение: 2");
        orderedMap.put(6, "Значение: 6");
        orderedMap.put(9, "Значение: 9");
        orderedMap.put(8, "Значение: 8");
        orderedMap.put(10, "Значение: 10");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("Ключ: %d : %s%n", entry.getKey(), entry.getValue());
        }
    }

    public static FullName getRandomName() {
        String name = "Test" + RANDOM.nextInt(1_000_000);
        String lastName = "TestLast" + RANDOM.nextInt(1_000_000);
        return new FullName(name, lastName);
    }

    public static String getPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(10));
        }
        return stringBuilder.toString();
    }
}
