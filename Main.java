import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> deals = new ArrayList<>();
        Deal deal = new Deal();

        while (true) {
            operations();
            int input = Integer.parseInt(scan.nextLine());

            if (input == 0) {
                break;
            }
            switch (input) {
                case 1:
                    deal.addDeal(deals, scan);
                    deal.listDeals(deals);
                    break;
                case 2:
                    deal.listDeals(deals);
                    break;
                case 3:
                    deal.removeDealNumber(deals, scan);
                    deal.listDeals(deals);
                    break;
                case 4:
                    deal.removeDealTitle(deals, scan);
                    deal.listDeals(deals);
                    break;
                case 5:
                    deal.removeDealWord(deals, scan);
                    deal.listDeals(deals);
                    break;
            }
        }

    }

    public static void operations() {
        System.out.println("Выберите операцию:\n" +
                "\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "5. Удалить по слову");
    }
}
