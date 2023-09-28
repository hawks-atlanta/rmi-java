package capyfile.rmi;

import com.healthmarketscience.rmiio.RemoteInputStream;
import java.io.Serializable;
import java.util.UUID;

public class DownloadFileRes implements Serializable
{
	public UUID uuid;
	public int size;
	public RemoteInputStream stream;

	public DownloadFileRes (UUID uuid, int size, RemoteInputStream stream)
	{
		this.uuid = uuid;
		this.size = size;
		this.stream = stream;
	}
}
