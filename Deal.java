import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Deal {

    public void addDeal(ArrayList<String> list, Scanner scan) {
        System.out.println("Введите название задачи:");
        String deal = scan.nextLine();
        list.add(deal);
        System.out.println("Добавлено!");
    }

    public void listDeals(ArrayList<String> list) {
        System.out.println("Ваш список дел: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void removeDealNumber(ArrayList<String> list, Scanner scan) {
        System.out.println("Введите номер для удаления: ");
        int number = Integer.parseInt(scan.nextLine());
        if (number > 0 && number <= list.size()) {
            list.remove(number - 1);
            System.out.println("Удалено!");
        } else {
            System.out.println("Вееден не существующий номер, задача не удалена");
        }
    }

    public void removeDealTitle(ArrayList<String> list, Scanner scan) {
        System.out.println("Введите задачу для удаления: ");
        String title = scan.nextLine();
        if (list.remove(title)){
            System.out.println("Задача  " + title + " удалена");
        } else {
            System.out.println("Задачи " + title + " нет в списке");
        }
    }

    public void removeDealWord(ArrayList<String> list, Scanner scan) {
        System.out.println("Введите слово для удаления задачи: ");
        String key = (scan.nextLine().toLowerCase());
        Iterator<String> iterator = list.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            String s = iterator.next().toLowerCase();
            String[] words = s.toLowerCase().split(" ");
            for (String word : words) {
                if (word.equals(key)) {
                    iterator.remove();
                    found = true;
                }
            }
        }
        if (found) {
            System.out.println("Задача со словом " + key + " удалена");
        } else {
            System.out.println("Задачи со словом " + key + " нет в списке");
        }
    }
}
