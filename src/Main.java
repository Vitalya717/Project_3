public class Main {
    public static void main(String[] args) {
        int currentAccount = 489;
        int replenishment = 1389;
        int bonus;
        if (replenishment > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int finalBonus = replenishment / 100 * bonus;
        int finalAccount = currentAccount + replenishment + finalBonus;

        System.out.println("Итоговый счет:" + finalAccount);
    }
}
