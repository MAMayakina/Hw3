public class Main {
    public static void main(String[] args) {
        //задание 1
        byte a = 1;
        short b = 128;
        int c = 125555;
        long d = 123L;
        float e = 1.1234567f;
        double g = 2.4545464445;
        boolean k = a<2;
        char m = 33;

        System.out.println("Hello"+m);

        //задание 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float sum = boxer1 + boxer2;
        System.out.println("Общий вес боксеров: "+ sum);
        float dif = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров: "+ Math.abs(dif));

        //задание 3
        int banana = 5;
        int weightBanana = 80;
        int milk = 200;
        int weightMilk = 105;
        int iceCream = 2;
        int weighticeCream = 100;
        int egg = 4;
        int weightEgg = 70;

        float totalWeightGr = banana * weightBanana + milk*weightMilk/100 + iceCream * weighticeCream + egg * weightEgg;
        System.out.println("Общий вес завтрака: "+ totalWeightGr + "гр");

        float totalWeightKg = totalWeightGr/1000;
        System.out.println("Общий вес завтрака: "+ totalWeightKg + "кг");

        //задание 4
        int weightLoss = 7000;
        int loss1 = 250;
        int loss2 = 500;
        float dayLoss1 = weightLoss/loss1;
        float dayLoss2 = weightLoss/loss2;
        float averageDay = (dayLoss1+dayLoss2)/2;

        System.out.println("Минимальное количество дней: "+ dayLoss1);
        System.out.println("Максимальное количество дней: "+ dayLoss2);
        System.out.println("Среднее количество дней: "+ averageDay);

        //задание 5
        int salaryMashaNow = 67760;
        int salaryDenisNow = 83690;
        int salaryKristinaNow = 76230;

        float salaryMashaNew = (float) (salaryMashaNow*1.1);
        float salaryDenisNew = (float) (salaryDenisNow*1.1);
        float salaryKristinaNew = (float) (salaryKristinaNow*1.1);

        int Month = 12;
        float increaseMasha = (salaryMashaNew - salaryMashaNow)*Month;
        float increaseDenis = (salaryDenisNew - salaryDenisNow)*Month;
        float increaseKristina = (salaryKristinaNew - salaryKristinaNow)*Month;

        System.out.println("Новая з/п Маши: "+ salaryMashaNew + " руб. Ее годовой доход вырос на "+ increaseMasha+ " руб.");
        System.out.println("Новая з/п Дениса: "+ salaryDenisNew + " руб. Его годовой доход вырос на "+ increaseDenis+ " руб.");
        System.out.println("Новая з/п Кристины: "+ salaryKristinaNew + " руб. Ее годовой доход вырос на "+ increaseKristina+ " руб.");
    }
}