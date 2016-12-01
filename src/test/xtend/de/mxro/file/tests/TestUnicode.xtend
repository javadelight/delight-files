package de.mxro.file.tests

import de.mxro.file.Jre.FilesJre
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class TestUnicode {

	@Rule
	val public TemporaryFolder folder = new TemporaryFolder();

	@Test
	def void test() {

		{
			val file = FilesJre.wrap(folder.newFile("test.txt"))

			file.text = "this and that and …"
		}

		{
			val file = FilesJre.wrap(folder.newFile("test.txt"))
	
	
			Assert.assertEquals("this and that and …", file.text)
		}

	}

}
