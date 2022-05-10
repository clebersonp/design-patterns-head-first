package pattern.br.design.weather.v1;

import java.util.ArrayList;
import java.util.List;

import pattern.br.design.observer.v1.Observer;
import pattern.br.design.subject.v1.Subject;

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

	@Override
	public void notifyObservers() {
		this.observers.forEach(o -> o.update(this.temperature, this.humidity, this.pressure));
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
