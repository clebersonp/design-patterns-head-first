package br.design.weather.v2;

import java.util.ArrayList;
import java.util.List;

import br.design.observer.v2.Observer;
import br.design.subject.v2.Subject;

/**
 * Classe que implementa Subject, responsavel por notificar os Observer
 * registrados a cada mudança de seu estado
 * 
 * @author cleberson
 *
 */
public class WeatherData implements Subject {

	/**
	 * Armazena instancias do tipo Observers
	 */
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(final Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(final Observer o) {
		this.observers.remove(o);
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public void measurementsChanged() {
		this.notifyObservers();
	}

	/*
	 * A ordem do objetos Observer que sera notificado n pode importar no Observer
	 * Pattern
	 */
	@Override
	public void notifyObservers() {
		this.observers.forEach(Observer::update);
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
