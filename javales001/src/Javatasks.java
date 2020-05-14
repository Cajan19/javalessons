public class Javatasks {
    public static void main(String[] args) {

//        prüfen, ob ein String länger als 20 Zeichen ist und "fancy" enthält:
        String lenghtInput = "Dinos sind fancy";
        int lenghtCount = getLength(lenghtInput);
        boolean lenghtCheck = checkLength(lenghtCount);
        boolean isFancy = isFancy("Dinos sind supersexy und fancy");

//      output für beide checks:
        System.out.println("Input contains <fancy>: " + isFancy);


    }

    public static boolean checkLength (int lenghtCount) {
        return lenghtCount > 20;
    }

    public static int getLength(String lenghtInput) {
        return lenghtInput.length();
    }

    public static boolean isFancy(String inputValue){
         return inputValue.contains("fancy");

    }


}


