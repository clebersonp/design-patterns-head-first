package refactoring_guru.decorator.example.decorators;

/**
 * 
 * Decorator base abstrato Decorator é um tipo abstrato e ao mesmo tempo tem o
 * mesmo tipo abstrato.
 * 
 * @author cleberson
 *
 */
public class DataSourceDecorator implements DataSource {

	private final DataSource wrapper;

	public DataSourceDecorator(final DataSource source) {
		this.wrapper = source;
	}

	@Override
	public void writeData(final String data) {
		this.wrapper.writeData(data);
	}

	@Override
	public String readData() {
		return this.wrapper.readData();
	}

}
