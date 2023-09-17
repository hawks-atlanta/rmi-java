package capyfile.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWorkerService extends Remote
{
	public void uploadFile (UploadFileArgs args) throws RemoteException;
	public File downloadFile (DownloadFileArgs args) throws RemoteException;
}
