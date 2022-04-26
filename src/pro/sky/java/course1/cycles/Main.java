package pro.sky.java.course1.cycles;

public class Main {
    public static void main(String[] args) {

        // задание 1

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // задание 2
        int firstFriday = 2;
        for (; firstFriday < 31; firstFriday +=7) {

            System.out.println("Сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет.");
            }

        // задание 3
        int s = 0;
        int startPeriod = 1822;
        int endPeriod = 2122;
        for (; s <= 2122; s+=79) {
            if (s >= startPeriod && s <= endPeriod) {
               System.out.println(s);


            }

        }









    }
}

