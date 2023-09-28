package capyfile.rmi;

import com.healthmarketscience.rmiio.RemoteInputStream;
import java.io.Serializable;

public class DownloadFileRes implements Serializable
{
	public String uuid;
	public byte[] contents;
	public RemoteInputStream stream;

	public DownloadFileRes (String uuid, byte[] contents)
	{
		this.uuid = uuid;
		this.contents = contents;
	}
}
