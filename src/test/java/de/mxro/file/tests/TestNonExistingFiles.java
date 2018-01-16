package de.mxro.file.tests;

import de.mxro.file.FileItem;
import de.mxro.file.Jre.FilesJre;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

@SuppressWarnings("all")
public class TestNonExistingFiles {
  @Rule
  public final TemporaryFolder folder = new TemporaryFolder();
  
  @Test
  public void test() {
    final FileItem file = FilesJre.wrap(this.folder.newFolder("test"));
    Assert.assertTrue(file.get("not.exists").getPath().contains("test"));
    Assert.assertFalse(file.get("not.exists").exists());
  }
}
