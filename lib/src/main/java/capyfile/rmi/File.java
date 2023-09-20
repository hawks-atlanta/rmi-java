package capyfile.rmi;

import java.io.Serializable;

public class File implements Serializable
{
	public String uuid;
	public byte[] contents;

	public File (String uuid, byte[] contents)
	{
		this.uuid = uuid;
		this.contents = contents;
	}
}
