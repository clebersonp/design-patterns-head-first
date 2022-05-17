package refactoring_guru.decorator.example.decorators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Leitor e escritor base de dados simples
 * 
 * @author cleberson
 *
 */
public class FileDataSource implements DataSource {

	private final String name;

	public FileDataSource(final String name) {
		super();
		this.name = name;
	}

	@Override
	public void writeData(final String data) {
		final File file = new File(this.name);
		try (final OutputStream fos = new FileOutputStream(file)) {
			fos.write(data.getBytes(), 0, data.length());
		} catch (final IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public String readData() {
		char[] buffer = null;
		final File file = new File(this.name);
		try (final FileReader reader = new FileReader(file)) {
			buffer = new char[(int) file.length()];
			reader.read(buffer);
			return new String(buffer);
		} catch (final IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	public String getData() {
		return name;
	}

}
