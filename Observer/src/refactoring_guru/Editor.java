package refactoring_guru;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Editor {

	private final EventManager eventManager;
	private final Map<String, EventType> supportedEventTypes;
	private File file;

	{
		final List<EventType> types = Arrays.asList(new EventTypeOpen(), new EventTypeSave());
		this.supportedEventTypes = new HashMap<>();
		types.forEach(t -> {
			this.supportedEventTypes.put(t.getName(), t);
		});
	}

	public Editor() {
		super();
		this.eventManager = new EventManager(new ArrayList<>(this.supportedEventTypes.values()));
	}

	public void openFile(final String filePath) {
		this.file = new File(filePath);
		this.getEventManager().notify(this.supportedEventTypes.get("open"), this.file);
	}

	public void saveFile() throws Exception {
		if (Objects.nonNull(this.file)) {
			this.getEventManager().notify(this.supportedEventTypes.get("save"), this.file);
		} else {
			throw new Exception("Please open a file first!");
		}
	}

	public EventManager getEventManager() {
		return this.eventManager;
	}

	public List<String> getEventTypesSupported() {
		return this.supportedEventTypes.values().stream().map(EventType::getName).collect(Collectors.toList());
	}

}
