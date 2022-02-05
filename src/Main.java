
public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int refill = 1100;
        int newBalance;
        int bonus;
        if (refill > 100) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        newBalance = startBalance + refill + bonus;
        System.out.println("Итоговый баланс: " + newBalance + " руб.");
        System.out.println("Ваши бонусы: " + bonus + " руб.");


    }
}