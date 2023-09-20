package capyfile.rmi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileTest
{
	@Test void someCreationTest ()
	{
		File f = new File ("----", null);

		assertTrue (f.uuid == "----", "UUID should be set");
		assertTrue (f.contents == null, "Contents should be set");
	}
}
