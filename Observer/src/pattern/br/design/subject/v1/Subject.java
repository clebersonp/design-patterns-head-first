package pattern.br.design.subject.v1;

import pattern.br.design.observer.v1.Observer;

/**
 * 
 * Interface Subject para gerenciar os Observers e notifica-los quando houver
 * mudança no estado do objeto
 * 
 * @author cleberson
 *
 */
public interface Subject {

	/**
	 * Registra um Observer
	 * 
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * Remove um Observer
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * Notifica todos os observer registrados a cada mudança no estado do objeto
	 */
	public void notifyObservers();

}
