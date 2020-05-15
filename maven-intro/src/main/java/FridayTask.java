
public class FridayTask {

    public static boolean passwordIsSecureOrNot(String enterPassword) {

//        enthält mindestens 8 Zeichen
        int passwordLength = enterPassword.length();
        if (passwordLength < 8) {
            return false;


        }


//    enthält Ziffern

        boolean pwContainsNumber = enterPassword.contains("1") || enterPassword.contains("2") || enterPassword.contains("3") ||
                enterPassword.contains("4") || enterPassword.contains("5") || enterPassword.contains("6") ||
                enterPassword.contains("7") || enterPassword.contains("8") || enterPassword.contains("9") || enterPassword.contains("0");
        if (!pwContainsNumber) {
            return false;
        }

//        enthält nur kleine/große Buchstaben


        boolean pwContainsSmallAndCapitalLetters = !enterPassword.equals(enterPassword.toLowerCase()) && !enterPassword.equals(enterPassword.toUpperCase());
        return pwContainsSmallAndCapitalLetters;


    }
}

