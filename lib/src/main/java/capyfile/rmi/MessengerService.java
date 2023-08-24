package capyfile.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessengerService extends Remote {
	public Message sendMessage(Message clientMessage) throws RemoteException;
}
