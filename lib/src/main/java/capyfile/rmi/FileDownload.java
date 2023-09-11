package capyfile.rmi.interfaces;

import java.io.Serializable;

public class FileDownload implements Serializable
{

	public String uuid;

	public FileDownload (String uuid) { this.uuid = uuid; }
}
