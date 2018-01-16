package de.mxro.file.tests

import de.mxro.file.Jre.FilesJre
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class TestNonExistingFiles {
	
	@Rule
	val public TemporaryFolder folder = new TemporaryFolder();

	@Test
	def void test() {

		{
			val file = FilesJre.wrap(folder.newFolder("test"))

			Assert.assertTrue(file.get("not.exists").path.contains("test"))
			
			Assert.assertFalse(file.get("not.exists").exists)
			
		}

		

	}
}