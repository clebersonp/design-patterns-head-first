package pattern.br.design.observer.v1;

import pattern.br.design.display.DisplayElement;
import pattern.br.design.weather.v1.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(final WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {

		this.tempSum += temperature;
		numReadings++;

		if (temperature > this.maxTemp) {
			this.maxTemp = temperature;
		}

		if (temperature < this.minTemp) {
			this.minTemp = temperature;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println(String.format("Avg/Max/Min temperature = %.1f/%.1f/%.1f", (this.tempSum / this.numReadings),
				this.maxTemp, this.minTemp));
	}

}
