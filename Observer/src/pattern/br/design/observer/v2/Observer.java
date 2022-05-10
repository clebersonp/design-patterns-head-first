package pattern.br.design.observer.v2;

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
	 * mudança no estado do objeto. Sem parametros. Observer devera recuperar os
	 * dados que lhe interessar. Assim evita de toda atualização no Subject passando
	 * um parametro novo, quebre o contrato de todos os Observers. Neste caso o
	 * Observer fara um 'pull' no Subject
	 * 
	 */
	public void update();

	/**
	 * 
	 * Se auto remover como observer do Subject
	 * 
	 */
	public void unregister();

	/**
	 * 
	 * Se auto adicionar como observer do Subject
	 * 
	 */
	public void register();

}
