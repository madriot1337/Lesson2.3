import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Мудрость", "Доброта", "Сомнение",
                "Агригат", "Синоним", "Лист",
                "Море", "Соль", "Физика",
                "Фигура", "Снадобье", "Мудрость",
                "Лист", "Море", "Доброта",
                "Соль", "Агригат", "Синоним", "Меч"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Shurpin", "894576356475");
        directory.add("Minov", "89153645467");
        directory.add("Sharov", "89167645346");
        directory.add("Sharov", "89162434546");
        directory.add("Shurpin", "89777777777");
        directory.add("Cherezov", "89153677689");
        directory.add("Sharov", "89152487654");
        directory.add("Minin", "89653642514");
        directory.add("Shurpin", "89662536546");

        System.out.println(directory.get("Shurpin"));
        System.out.println(directory.get("Sharov"));
        System.out.println(directory.get("Minin"));
        System.out.println(directory.get("Cherezov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}




