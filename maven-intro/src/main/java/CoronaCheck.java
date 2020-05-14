public class CoronaCheck {

    public static String isTooCrowded(int numberOfCustomers) {
        if (numberOfCustomers <= 30) {
            return "Noch Platz";
        }
        return "Zu voll";

    }

    public static int numberAllowedInside (String levelOfAlarm) {
        switch (levelOfAlarm){
            case "red":
                return 0;
            case "yellow":
                return 30;
            case "green":
                return 60;
            default:
                return 0;
        }

        }
    }

