package refactoring_guru;

import java.io.File;

public class EmailNotificationListener implements EventListener {

	private final String email;

	public EmailNotificationListener(String email) {
		super();
		this.email = email;
	}

	@Override
	public void update(final EventType eventType, final File file) {
		System.out.println(
				String.format("Email to '%s': Someone has performed '%s' operation with the following file: '%s'",
						this.getEmail(), eventType.getName(), file.getName()));
	}

	public String getEmail() {
		return email;
	}

}
