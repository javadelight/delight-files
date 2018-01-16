package de.mxro.file.internal;

import java.util.Date;
import java.util.List;

import de.mxro.file.FileItem;
import delight.strings.UriUtils;

public class NotExistentFileItem implements FileItem {

	final private static String ILLEGAL_ACCESS = "Cannot access property of non-existent file.";
	final private static String ILLEGAL_OPERATION = "Cannot perform operation on non-existent file";

	private final String name;
	private final String parentPath;
	private final FileItem parent;

	public NotExistentFileItem(String name, FileItem parent) {
		this.name = name;
		this.parentPath = UriUtils.assertSlash(parent.getPath());
		this.parent = parent;
	}

	@Override
	public boolean isDirectory() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public FileItem get(final String childName) {
		if (name == null) {
			throw new RuntimeException(ILLEGAL_ACCESS);
		}
		
		return new NotExistentFileItem(childName, this);
	}

	@Override
	public FileItem assertFolder(final String folderName) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public FileItem createFile(final String fileName) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public FileItem deleteFile(final String fileName) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public FileItem deleteFolder(final String folderName) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public String getName() {
		if (name == null) {
			throw new RuntimeException(ILLEGAL_ACCESS);
		}
		return name;
	}

	@Override
	public String getExtension() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public FileItem setVisible(final boolean isVisible) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public boolean getVisible() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public List<FileItem> getChildren() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public Date lastModified() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public String hash() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public String getText() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public FileItem setText(final String text) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public boolean contains(final String fileName) {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public String getPath() {
		if (name == null) {
			throw new RuntimeException(ILLEGAL_ACCESS);
		}
		return parentPath+name;
	}

	@Override
	public FileItem assertFile(final String fileName) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public FileItem empty() {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public boolean getIsLink() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public FileItem find(final String pattern) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public List<FileItem> findAll(final String pattern) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public FileItem copyTo(final FileItem destination) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

	@Override
	public FileItem getParent() {
		return parent;
	}

	@Override
	public byte[] getData() {
		throw new RuntimeException(ILLEGAL_ACCESS);
	}

	@Override
	public FileItem setData(final byte[] data) {
		throw new RuntimeException(ILLEGAL_OPERATION);
	}

}
