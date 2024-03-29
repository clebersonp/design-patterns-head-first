package pattern.br.design.weather.v2;

import pattern.br.design.observer.v2.CurrentConditionsDisplay;
import pattern.br.design.observer.v2.ForecastDisplay;
import pattern.br.design.observer.v2.HeatIndexDisplay;
import pattern.br.design.observer.v2.StatisticsDisplay;

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

		// se auto remover como observer do Subject
//		currentDisplay.unregister();
//		statisticsDisplay.unregister();
//		forecastDisplay.unregister();
		weatherData.removeObserver(currentDisplay);
		weatherData.removeObserver(statisticsDisplay);
		weatherData.removeObserver(forecastDisplay);

		weatherData.setMeasurements(75, 80, 27.9f);
		System.out.println("\n-------------------------------------------------------\n");

		// se auto adicionando como observers
//		currentDisplay.register();
//		statisticsDisplay.register();
//		forecastDisplay.register();
		weatherData.removeObserver(heatIndexDisplay);
		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(forecastDisplay);
		
		weatherData.setMeasurements(79, 88, 28.5f);
		System.out.println("\n-------------------------------------------------------\n");

	}

}
