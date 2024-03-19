package convertisseurtemperature;

public class TemperatureService {
	public static double celsiusAFahrenheit(double tempCelsius) {
		return (double)9/5*tempCelsius+32;
	}
	public static double fahrenheitACelsius(double tempFahrenheit) {
		return (double)5/9*(tempFahrenheit-32);
	}
}
