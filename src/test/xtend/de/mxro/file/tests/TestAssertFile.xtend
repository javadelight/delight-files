package de.mxro.file.tests

import de.mxro.file.Jre.FilesJre
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class TestAssertFile {
	@Rule
	val public TemporaryFolder folder = new TemporaryFolder();

	@Test
	def void test() {

		{
			val folder = FilesJre.wrap(folder.newFolder("test"))

			folder.assertFile("test.txt").text  = "here we are!"
		}

		

	}
	
}