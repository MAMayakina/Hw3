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
        float number1 = 78.2f;
        float number2 = 82.7f;
        float sum = number1 + number2;
        System.out.println("Общий вес боксеров: "+ sum);
        float dif = number2 - number1;
        System.out.println("Разница в весе боксеров: "+ dif);

        //задание 3
        int banana = 5;
        int weightBanana = 80;
        int milk = 200;
        int weightMilk = 105;
        int iceCream = 2;
        int weighticeCream = 100;
        int egg = 4;
        int weightEgg = 70;

        int totalWeightGr = banana * weightBanana + milk*weightMilk/100 + iceCream * weighticeCream + egg * weightEgg;
        System.out.println("Общий вес завтрака: "+ totalWeightGr + "гр");

        float totalWeightKg = totalWeightGr/1000;
        System.out.println("Общий вес завтрака: "+ totalWeightKg + "кг");

        //задание 4
        int weightLoss = 7;
        int lossMin = 250;
        int lossMax = 500;
        int dayLossMin = weightLoss*1000/lossMin;
        int dayLossMax = weightLoss*1000/lossMax;
        int averageDay = (dayLossMax+dayLossMin)/2;

        System.out.println("Минимальное количество дней: "+ dayLossMin);
        System.out.println("Максимальное количество дней: "+ dayLossMax);
        System.out.println("Среднее количество дней: "+ averageDay);

        //задание 5
        int salaryMashaNow = 67760;
        int salaryDenisNow = 83690;
        int salaryKristinaNow = 76230;

        int salaryMashaNew = (int) (salaryMashaNow * 1.1);
        int salaryDenisNew = (int) (salaryDenisNow * 1.1);
        int salaryKristinaNew = (int) (salaryKristinaNow * 1.1);

        int Month = 12;
        int increaseMasha = (salaryMashaNew - salaryMashaNow)*Month;
        int increaseDenis = (salaryDenisNew - salaryDenisNow)*Month;
        int increaseKristina = (salaryKristinaNew - salaryKristinaNow)*Month;

        System.out.println("Новая з/п Маши: "+ salaryMashaNew + " руб. Ее годовой доход вырос на "+ increaseMasha+ " руб.");
        System.out.println("Новая з/п Дениса: "+ salaryDenisNew + " руб. Его годовой доход вырос на "+ increaseDenis+ " руб.");
        System.out.println("Новая з/п Кристины: "+ salaryKristinaNew + " руб. Ее годовой доход вырос на "+ increaseKristina+ " руб.");
    }
}