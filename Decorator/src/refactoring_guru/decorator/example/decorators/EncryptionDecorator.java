package refactoring_guru.decorator.example.decorators;

import java.util.Base64;

/**
 * 
 * Decorador de encriptação
 * 
 * @author cleberson
 *
 */
public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(final DataSource source) {
		super(source);
	}

	/**
	 * 
	 * Sobrescreve o método de escrita para anexar funcionalidades(comportamentos)
	 * adicionais ao objeto.
	 * 
	 */
	@Override
	public void writeData(final String data) {
		super.writeData(this.encode(data));
	}

	/**
	 * 
	 * Sobrescreve o método de leitura para anexar funcionalidades(comportamentos)
	 * adicionais ao objeto.
	 * 
	 */
	@Override
	public String readData() {
		return this.decode(super.readData());
	}

	private String encode(final String data) {
		final byte[] result = data.getBytes();
		for (int i = 0; i < result.length; i++) {
			result[i] += (byte) 1;
		}
		return Base64.getEncoder().encodeToString(result);
	}

	private String decode(final String data) {
		final byte[] result = Base64.getDecoder().decode(data);
		for (int i = 0; i < result.length; i++) {
			result[i] -= (byte) 1;
		}
		return new String(result);
	}

}
