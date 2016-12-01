package de.mxro.file.tests;

import de.mxro.file.FileItem;
import de.mxro.file.Jre.FilesJre;
import java.io.File;
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
        File _newFile = this.folder.newFile("test.txt");
        final FileItem file = FilesJre.wrap(_newFile);
        file.setText("this and that and …");
      }
      {
        File _newFile = this.folder.newFile("test.txt");
        final FileItem file = FilesJre.wrap(_newFile);
        String _text = file.getText();
        Assert.assertEquals("this and that and …", _text);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
