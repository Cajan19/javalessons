public class PasswordCheck {

    public static boolean passwordHasAtLeastEightDigits(String enterPassword) {

//        check, ob das Passwort mindestens 8 Zeichen enthält
        int passwordLenght = enterPassword.length();
        if (passwordLenght < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean passwordContainsUpperandLowerCase(String enterPassword) {

//        check, ob das Passwort Groß- und Kleinbuchstaben enthält
        boolean passwordCases = !enterPassword.equals(enterPassword.toLowerCase()) && !enterPassword.equals(enterPassword.toUpperCase());
        return passwordCases;

    }

    public static boolean passwordContainsNumber(String enterPassword) {

//        check, ob Ziffern enthalten sind

        boolean passwordDigit = enterPassword.contains("1") || enterPassword.contains("2") || enterPassword.contains("3") ||
                enterPassword.contains("4") || enterPassword.contains("5") || enterPassword.contains("6") || enterPassword.contains("7")
                || enterPassword.contains("8") || enterPassword.contains("9") || enterPassword.contains("0");
        return passwordDigit;


    }


}




