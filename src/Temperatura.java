public class Temperatura {
    public static double CelsiusparaFareheit(double celsius){

        return  (9.0 / 5.0) * celsius + 32 ;
    }
    public static double CelsiusparaKelvin (int celsius){

        return celsius + 273.15;
    }
    public static String ClassificaTemperatura (double celsius) {

        if (celsius == 0) {
            return "Zero";
        } else if (celsius < 0) {
            return "Negativa";
        } else {
            return "Positiva";
        }
    }
    public static boolean ValidaConversaoCelsiusFarenheit(double celsius, double farenheit) {

        double tempEmFahrenheit = CelsiusparaFareheit(celsius);
        return Double.compare(tempEmFahrenheit, farenheit) == 0;
    }
}
