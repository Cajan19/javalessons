public class WeatherUtils {

    public static String isTooCrowded(int numberOfCustomers) {
        if (numberOfCustomers <= 30) {
            return "Noch Platz";
        }
        return "Zu voll";

    }

    public static void calculate() {
        double numberOne = 5;
//        statt numberOne = numberOne / 2 kann abgekürzt werden mit /=
        numberOne /= 2;
        System.out.println(numberOne);
    }
}
