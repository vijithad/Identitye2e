package com.identity.e2e.model;

public enum FileTypeEnum {
    CSV("csv"),
    XLS("xls");
    public String type;

    FileTypeEnum(String type) {
    this.type=type;
    }
}