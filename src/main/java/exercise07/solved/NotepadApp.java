package exercise07.solved;

import java.util.HashMap;
import java.util.Map;

public class NotepadApp {
	
	public static Map<String,MenuHandler> handlerMappings = new HashMap<>(); 
	
	public void handleEvent(MenuEvent e){
		String menuLabel = e.getMenuLabel();
		MenuHandler handler = handlerMappings.get(menuLabel);
		handler.handle(e);
		
	}

}
