package refactoring_guru.decorator.example.decorators;

/**
 * Interface de dados comum, que define as operações de ler escrever
 * 
 * @author cleberson
 *
 */
public interface DataSource {

	/**
	 * Define a operação de escrita do dado
	 * 
	 * @param data a ser gravado
	 */
	void writeData(String data);

	/**
	 * 
	 * Define a leitura de um dado
	 * 
	 * @return o dado lido
	 */
	String readData();

}
