package br.design.observer.v2;

import br.design.display.DisplayElement;
import br.design.weather.v2.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(final WeatherData weatherData) {
		this.weatherData = weatherData;
		this.register();
	}

	/*
	 * Recuperando somente os dados que lhe interessar de weatherData, ou seja,
	 * fazendo um pull
	 */
	@Override
	public void update() {
		this.lastPressure = currentPressure;
		this.currentPressure = this.weatherData.getPressure();
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

	@Override
	public void unregister() {
		this.weatherData.removeObserver(this);
	}

	@Override
	public void register() {
		this.weatherData.registerObserver(this);
	}

}
