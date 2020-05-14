public class WeatherUtils {

    public static String isTooCrowded(int numberOfCustomers) {
        if (numberOfCustomers <= 30) {
            return "Noch Platz";
        }
        return "Zu voll";

    }
}