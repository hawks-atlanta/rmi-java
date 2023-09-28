package capyfile.rmi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileDownloadTest
{
	@Test void someCreationTest ()
	{
		DownloadFileArgs f = new DownloadFileArgs ("----", 1);

		assertTrue (f.uuid == "----", "UUID should be set");
	}
}
