package pattern.br.design.observer.v1;

import pattern.br.design.display.DisplayElement;
import pattern.br.design.weather.v1.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(final WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.lastPressure = currentPressure;
		this.currentPressure = pressure;
		this.display();
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (this.currentPressure > this.lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (this.currentPressure == this.lastPressure) {
			System.out.println("More of the same");
		} else if (this.currentPressure < this.lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
