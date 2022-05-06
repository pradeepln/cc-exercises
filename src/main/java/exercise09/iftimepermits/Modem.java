package exercise09.iftimepermits;

import java.net.Socket;

public class Modem implements Connection, DataChannel {

	Socket s;
	
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		s = null;//some init
	}
	
	
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	//__________________________________________
	
	
	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		// s.getoutputstream or similar
	}
	
	
	
	@Override
	public void receiveData() {
		// TODO Auto-generated method stub
		
	}
	

}
