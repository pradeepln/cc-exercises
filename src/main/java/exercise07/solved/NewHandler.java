package exercise07.solved;

public class NewHandler implements MenuHandler {
	static {
		NotepadApp.handlerMappings.put("new", new NewHandler());
	}
	public void handle(MenuEvent e) {
		//logic of creating new document
	}

}
