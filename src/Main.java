public class Main {
    public static void main(String[] args) {

        int[] payments = new int[5];
        payments[0] = 200;
        payments[1] = 150;
        payments[2] = 300;
        payments[3] = 100;
        payments[4] = 500;
        int paymentsSumm = 0;
        for (int elements = 0; elements < payments.length; elements++) {
            paymentsSumm += payments[elements];
        }
        System.out.println("Сумма трат за месяц составила " + paymentsSumm + " рублей");

        int[] wastes = new int[5];
        wastes[0] = 500;
        wastes[1] = 700;
        wastes[2] = 300;
        wastes[3] = 900;
        wastes[4] = 150;
        int minWastes = 10000;
        int maxWastes = 0;
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maxWastes) {
                maxWastes = wastes[i];
            }
            if (wastes[i] < minWastes) {
                minWastes = wastes[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWastes + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxWastes + " рублей");

        int[] wastes1 = new int[5];
        wastes1[0] = 420;
        wastes1[1] = 230;
        wastes1[2] = 170;
        wastes1[3] = 560;
        wastes1[4] = 380;
        int summWastes1 = 0;
        int average = 0;
        for (int j = 0; j < wastes1.length; j++) {
            summWastes1 += wastes1[j];
            average = summWastes1 / wastes1.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i1 = reverseFullName.length - 1; i1 >= 0; i1--) {
            System.out.print(reverseFullName[i1]);

        }
    }
}







