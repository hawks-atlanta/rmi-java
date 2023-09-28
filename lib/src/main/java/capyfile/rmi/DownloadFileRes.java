package capyfile.rmi;

import com.healthmarketscience.rmiio.RemoteInputStream;
import java.io.Serializable;

public class DownloadFileRes implements Serializable
{
	public String uuid;
	public RemoteInputStream stream;

	public DownloadFileRes (String uuid, RemoteInputStream stream)
	{
		this.uuid = uuid;
		this.stream = stream;
	}
}
