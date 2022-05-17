package refactoring_guru.decorator.example.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * Decorator de compressão
 * 
 * @author cleberson
 *
 */
public class CompressionDecorator extends DataSourceDecorator {

	private int compLevel = 6;

	public CompressionDecorator(final DataSource source) {
		super(source);
	}

	public int getCompLevel() {
		return compLevel;
	}

	public void setCompLevel(int compLevel) {
		this.compLevel = compLevel;
	}

	@Override
	public void writeData(final String data) {
		super.writeData(this.compress(data));
	}

	@Override
	public String readData() {
		return this.decompress(super.readData());
	}

	private String compress(final String stringData) {
		final byte[] data = stringData.getBytes();
		try {
			final ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			final DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(this.getCompLevel()));
			dos.write(data);

			dos.close();
			bout.close();

			return Base64.getEncoder().encodeToString(bout.toByteArray());

		} catch (final IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	private String decompress(final String stringData) {
		final byte[] data = Base64.getDecoder().decode(stringData);
		try {
			final InputStream in = new ByteArrayInputStream(data);
			final InflaterInputStream iin = new InflaterInputStream(in);
			final ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			int b;
			while ((b = iin.read()) != -1) {
				bout.write(b);
			}

			in.close();
			iin.close();
			bout.close();

			return new String(bout.toByteArray());
			
		} catch (final IOException e) {
			System.out.print(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

}
