package capyfile.rmi.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileDownloadTest
{
	@Test void someCreationTest ()
	{
		FileDownload f = new FileDownload ("----");

		assertTrue (f.uuid == "----", "UUID should be set");
	}
}
