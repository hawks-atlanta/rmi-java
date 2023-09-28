package capyfile.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWorkerService extends Remote
{
	public void uploadFile (UploadFileArgs args) throws RemoteException;
	public DownloadFileRes downloadFile (DownloadFileArgs args) throws Exception;
}
