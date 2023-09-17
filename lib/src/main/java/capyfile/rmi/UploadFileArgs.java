package capyfile.rmi.interfaces;

import java.io.Serializable;

public class UploadFileArgs implements Serializable
{
	public String uuid;
	public byte[] contents;

	public UploadFileArgs (String uuid, byte[] contents)
	{
		this.uuid = uuid;
		this.contents = contents;
	}
}
