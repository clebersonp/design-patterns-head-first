package refactoring_guru;

import java.io.File;

/**
 * Define uma interface para publicadores para notificação de alteração de
 * estado.
 * 
 * @author cleberson
 *
 */
public interface Publisher {

	void subscribe(EventType eventType, EventListener listener);

	void unsubscribe(EventType eventType, EventListener listener);

	void notify(EventType eventType, File file);
}
