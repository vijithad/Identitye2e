package com.identity.e2e.model;

import java.io.File;
/* This is a File Bean with setters and getters of File Types & Information */
public class E2eFile {

    private final String name;
    private final String extension;
    private final long size;
    private final String mimeType;
    private final File file;

    public E2eFile(final String name, final String extension, final long size, final String mimeType, final File file) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.mimeType = mimeType;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public long getSize() {
        return size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public File getFile() {
        return file;
    }
}