package refactoring_guru;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 
 * Classe responsável pelo gerenciamento dos listeners. Adição, remoção e
 * notificação.
 * 
 * OO Principles:
 * - Encapsulate what varies;
 * - Favor composition over inheritance;
 * - Program to interfaces, not implementation;
 * - Strive for loosely coupled designs between objetcs that interact;
 * 
 * Observer - defines a one-to-many dependency between objects so that
 * when one object changes state, all its dependents are notified and
 * updated automatically;
 * 
 * @author cleberson
 *
 */
public class EventManager implements Publisher {

	private final Map<String, List<EventListener>> listeners = new HashMap<>();

	public EventManager(final List<EventType> operations) {
		super();
		for (final EventType operation : operations) {
			this.listeners.put(operation.getName(), new ArrayList<>());
		}
	}

	@Override
	public void subscribe(final EventType eventType, final EventListener listener) {
		final List<EventListener> eventsListener = this.listeners.get(eventType.getName());
		this.validateTypeSupported(eventType, eventsListener);
		eventsListener.add(listener);
	}

	@Override
	public void unsubscribe(final EventType eventType, final EventListener listener) {
		final List<EventListener> eventsListener = this.listeners.get(eventType.getName());
		this.validateTypeSupported(eventType, eventsListener);
		eventsListener.remove(listener);
	}

	@Override
	public void notify(final EventType eventType, final File file) {
		final List<EventListener> eventsListener = this.listeners.get(eventType.getName());
		this.validateTypeSupported(eventType, eventsListener);
		for (final EventListener user : eventsListener) {
			user.update(eventType, file);
		}
	}

	/**
	 * Valida se a operação é suportada(implementada) ou não.
	 * 
	 * @param eventType
	 * @param eventsListener
	 */
	private void validateTypeSupported(final EventType eventType, final List<EventListener> eventsListener) {
		if (Objects.isNull(eventsListener)) {
			throw new IllegalArgumentException(
					String.format("The '%s 'operation is not supported yet! See all operations supported first!",
							eventType.getName()));
		}
	}

}
