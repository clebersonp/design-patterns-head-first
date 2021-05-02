package br.design.observer.v1;

/**
 * 
 * Interface Observer ou Listener para ser executado o metodo update quando
 * invocado pelo Subject
 * 
 * @author cleberson
 *
 */
public interface Observer {

	/**
	 * 
	 * Metodo que sera invocado a partir do Subject para notificar de uma nova
	 * mudança no estado do objeto
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temperature, float humidity, float pressure);

}
