public class Main {
    public static void main(String[] args) {
        int clientAccount = 100; // счёт клиента, до пополнения
        int sumDeposit = 1100; // внесенная на счёт сумма
        int bonus100Rub = 1; // бонус за каждые 100 рублей при пополнении баланса
        int minSumDeposit = 1000; // бонус начисляется при пополнении счёта от 1000 руб

        int bonusTotalRub;
        if (sumDeposit > minSumDeposit) {
            bonusTotalRub = sumDeposit / bonus100Rub / 100;
        } else {
            bonusTotalRub = 0;
        }
        System.out.println("На Вашем счету " + (clientAccount+sumDeposit+bonusTotalRub) + " рублей. Вам начислено " + bonusTotalRub + " бонусных рублей.");
    }
}
