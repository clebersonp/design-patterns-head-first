package refactoring_guru;

import java.io.File;

/**
 * 
 * Todos os assinantes deverão implementar essa interface
 * 
 * @author cleberson
 *
 */
public interface EventListener {

	void update(EventType eventType, File file);
	
}
