package exercise07.solved;

public class SaveHandler implements MenuHandler{
	static {
		NotepadApp.handlerMappings.put("save", new SaveHandler());
	}
	
	public void handle(MenuEvent e) {
		//logic of save document
	}

}
