[![Build Status](https://travis-ci.org/javadelight/delight-files.svg)](https://travis-ci.org/javadelight/delight-files)

# delight-files

This library provides an abstract, cross-platform API for working with files and folders.

**Why** This is a very lightweight abstraction on top of vanilla java.io.File. 
Adding this project as a dependency to your projects should come with very little risk.
Using the FileItem class is infinitely more convenient than using the standard Java classes for many use cases.

## Usage

### Creating a New File And Setting Its Contents

```java
FileItem file = FilesJre.wrap(new File("/tmp"))
    
file.assertFolder("a Folder").createFile("my file.txt").setText("The content")
```


### Reading File Contents as String

```java
FileItem file = FilesJre.wrap(new File("/tmp/my file.txt"));

String content = file.getText();

System.out.println(content);
```

### Traversing through Directories

```java
FileItem file = FilesJre.wrap(new File("/"));

boolean there = file.get("tmp").get("my file.txt").exists();
```

### More Operations

For more operations check the JavaDoc of [FileItem](http://modules.appjangle.com/file-api/latest/apidocs/de/mxro/file/FileItem.html).



## Compatibility

This project is compatible with the following environments:

- Java 1.6+
- GWT 2.5.0+
- Android (any)
- OSGi (any)

## Further Resources

- [JavaDocs](http://modules.appjangle.com/delight-files/latest/apidocs/)
- [Project Reports](http://modules.appjangle.com/delight-files/latest/project-reports.html)



    
