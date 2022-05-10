package refactoring_guru;

import java.util.List;

public class Demo {

	public static void main(String[] args) {

		final EventType open = new EventTypeOpen();
		final EventType save = new EventTypeSave();
		final EventType close = new EventTypeClose();

		final Editor editor = new Editor();

		editor.getEventManager().subscribe(open, new LogOpenListener("/path/to/log/file.txt"));
		editor.getEventManager().subscribe(save, new EmailNotificationListener("admin@example.com"));

		final List<String> eventTypesSupported = editor.getEventTypesSupported();
		System.out.println(String.format("Supported operations: %s", eventTypesSupported));
		
//		Operação não suportada para testes
//		editor.getEventManager().subscribe(close, new EmailNotificationListener("close@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (final Exception e) {
			e.printStackTrace();
		}

	}

}
