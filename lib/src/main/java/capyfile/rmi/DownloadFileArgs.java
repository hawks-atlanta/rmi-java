package capyfile.rmi;

import java.io.Serializable;

public class DownloadFileArgs implements Serializable
{
	public String uuid;
	public int volume;

	public DownloadFileArgs (String uuid, int volume)
	{
		this.uuid = uuid;
		this.volume = volume;
	}
}
