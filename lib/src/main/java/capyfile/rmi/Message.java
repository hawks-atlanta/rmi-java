package capyfile.rmi.interfaces;

import java.io.Serializable;

public class Message implements Serializable {
	
	public String content;
	
	public Message(String content) {
		this.content = content;
	}
	
}
