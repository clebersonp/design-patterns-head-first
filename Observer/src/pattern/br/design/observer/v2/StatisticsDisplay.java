package pattern.br.design.observer.v2;

import pattern.br.design.display.DisplayElement;
import pattern.br.design.weather.v2.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(final WeatherData weatherData) {
		this.weatherData = weatherData;
		this.register();
	}

	/*
	 * Recuperando somente os dados que lhe interessar de weatherData, ou seja,
	 * fazendo um pull
	 */
	@Override
	public void update() {

		float temperature = this.weatherData.getTemperature();

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

	@Override
	public void unregister() {
		this.weatherData.removeObserver(this);
	}

	@Override
	public void register() {
		this.weatherData.registerObserver(this);
	}

}
