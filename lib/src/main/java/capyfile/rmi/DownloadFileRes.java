package capyfile.rmi;

import com.healthmarketscience.rmiio.RemoteInputStream;
import java.io.Serializable;
import java.util.UUID;

public class DownloadFileRes implements Serializable
{
	public UUID uuid;
	public long size;
	public RemoteInputStream stream;

	public DownloadFileRes (UUID uuid, long size, RemoteInputStream stream)
	{
		this.uuid = uuid;
		this.size = size;
		this.stream = stream;
	}
}
