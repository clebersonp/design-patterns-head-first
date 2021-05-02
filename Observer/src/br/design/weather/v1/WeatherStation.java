package br.design.weather.v1;

import br.design.observer.v1.CurrentConditionsDisplay;
import br.design.observer.v1.ForecastDisplay;
import br.design.observer.v1.HeatIndexDisplay;
import br.design.observer.v1.StatisticsDisplay;

/*
 * 
 * Principle:
 * Strive for loosely coupled design between objects that interact
 * (Observers são baixo acoplamento pois Subject não sabe nada sobre, a não ser que implementa a interface Observer.
 * Qualquer alterações nas classes concretas de Observer nao afeta o Subject)
 * 
 * Observer - defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically
 * 
 */
public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		/*
		 * A cada chamada do metodo setMeasurements, os observers serao notificados da
		 * mudança do estado do objeto
		 */
		System.out.println("-------------------------------------------------------\n");
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("\n-------------------------------------------------------\n");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("\n-------------------------------------------------------\n");
		weatherData.setMeasurements(78, 90, 30.4f);
		System.out.println("\n-------------------------------------------------------\n");
		weatherData.setMeasurements(75, 80, 27.9f);
		System.out.println("\n-------------------------------------------------------\n");

	}

}
