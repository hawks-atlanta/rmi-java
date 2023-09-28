package capyfile.rmi;

import java.io.Serializable;
import java.util.UUID;

public class UploadFileArgs implements Serializable
{
	public UUID uuid;
	public byte[] contents;

	public UploadFileArgs (UUID uuid, byte[] contents)
	{
		this.uuid = uuid;
		this.contents = contents;
	}
}
