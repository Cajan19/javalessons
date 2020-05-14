public class AppMain {

    public static void main(String[] args) {

        String tooCrowded = WeatherUtils.isTooCrowded(Integer.parseInt(args[0]));
        System.out.println(tooCrowded);
    }
}
