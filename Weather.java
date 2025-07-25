import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        
        printTemperatures("Celsius", celsius);
        printTemperatures("Fahrenheit", fahrenheit);
        
        
    }

    public static void printTemperatures(String tempType, double[] temp) {
         System.out.print(tempType + ": ");
         for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
         }
         System.out.print("\n");
    }

    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
           
        for (int i = 0; i < fahrenheit.length;i++) {
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32;            
            }
            return fahrenheit;        
    }
}
