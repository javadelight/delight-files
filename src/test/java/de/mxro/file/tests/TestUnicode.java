package de.mxro.file.tests;

import de.mxro.file.FileItem;
import de.mxro.file.Jre.FilesJre;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

@SuppressWarnings("all")
public class TestUnicode {
  @Rule
  public final TemporaryFolder folder = new TemporaryFolder();
  
  @Test
  public void test() {
    try {
      {
        final FileItem file = FilesJre.wrap(this.folder.newFile("test.txt"));
        file.setText("this and that and …");
      }
      {
        final FileItem file = FilesJre.wrap(this.folder.newFile("test.txt"));
        Assert.assertEquals("this and that and …", file.getText());
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
