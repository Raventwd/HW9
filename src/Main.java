public class Main {
    public static void main(String[] args) {
        System.out.println("//Task 1");
        int[]month=new int []{100001,100002,100003,100004,100005,100006,100007,100008,100009,100010,
                110000,120000,130000,140000,150000,160000,170000,180000,190000,111000,112000,113000,
                114000,151000,161000,171000,181000,191000,199000,200000};
        int sum = 0;
        for (int element: month){
            sum+=element;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей.");

        System.out.println(" ");
        System.out.println("//Task 2");

        int[]moneySpent=new int[]{30,60,20,15,100};
        int minSpent=-1;
        int maxSpent=-1;

        for (int i = 0; i < moneySpent.length; i++){
            if (moneySpent[i]>maxSpent){
                maxSpent=moneySpent[i];
            }
        }
        System.out.println("Максимальная сумма за день составила "+maxSpent);

        for (int i = 0; i < moneySpent.length; i++){
            if (moneySpent[i]<maxSpent){
                minSpent=moneySpent[i];
            }
        }
        System.out.println("Минимальная сумма за день составила "+minSpent);

        System.out.println(" ");
        System.out.println("//Task 3");
        int[]monthMoneySpent=new int []{100003,100002,100003,100004,100005,100006,100007,100008,100009,100010,
                110000,120000,130000,140000,150000,160000,170000,180000,190000,111000,112000,113000,
                114000,151000,161000,171000,181000,191000,199000,200000};
        double summa = 0;
        for (int element: monthMoneySpent){
            summa+=element;
        }
        summa=summa/30;
        System.out.println("Средняя сумма трат за месяц составила "+summa+" рублей");

        System.out.println(" ");
        System.out.println("//Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName.length);
        for (int index = 10; index <= reverseFullName.length && index !=-1 ; index--) {
            if (index == reverseFullName.length) {
                System.out.println(reverseFullName[index]);
                break;
            }
            System.out.print(reverseFullName[index] + " ");
        }

    }
}
