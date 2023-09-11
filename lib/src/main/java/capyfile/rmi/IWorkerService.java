package capyfile.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWorkerService extends Remote
{
	public void uploadFile (File upload) throws RemoteException;
	public File downloadFile (FileDownload download) throws RemoteException;
}
