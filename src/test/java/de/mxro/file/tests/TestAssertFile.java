package de.mxro.file.tests;

import de.mxro.file.FileItem;
import de.mxro.file.Jre.FilesJre;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

@SuppressWarnings("all")
public class TestAssertFile {
  @Rule
  public final TemporaryFolder folder = new TemporaryFolder();
  
  @Test
  public void test() {
    final FileItem folder = FilesJre.wrap(this.folder.newFolder("test"));
    FileItem _assertFile = folder.assertFile("test.txt");
    _assertFile.setText("here we are!");
  }
}
