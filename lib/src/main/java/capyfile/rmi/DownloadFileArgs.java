package capyfile.rmi;

import java.io.Serializable;

public class DownloadFileArgs implements Serializable
{
	public String uuid;

	public DownloadFileArgs (String uuid) { this.uuid = uuid; }
}
