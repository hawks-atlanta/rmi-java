package capyfile.rmi;

import java.io.Serializable;
import java.util.UUID;

public class DownloadFileArgs implements Serializable
{
	public UUID uuid;
	public int volume;

	public DownloadFileArgs (UUID uuid, int volume)
	{
		this.uuid = uuid;
		this.volume = volume;
	}
}
