package exercise07.solved;

public class OpenHandler implements MenuHandler{
	static {
		NotepadApp.handlerMappings.put("open", new OpenHandler());
	}
	
	public void handle(MenuEvent e) {
		//logic of creating open document
	}

}
