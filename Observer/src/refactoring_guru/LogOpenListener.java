package refactoring_guru;

import java.io.File;

public class LogOpenListener implements EventListener {

	private final File log;

	public LogOpenListener(final String fileName) {
		super();
		this.log = new File(fileName);
	}

	@Override
	public void update(final EventType eventType, final File file) {
		System.out.println(
				String.format("Save to log '%s': Someone has performed '%s' operation with the following file: '%s'",
						this.getLog(), eventType.getName(), file.getName()));
	}

	public File getLog() {
		return log;
	}

}
