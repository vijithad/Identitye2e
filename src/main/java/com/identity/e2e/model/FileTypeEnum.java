package com.identity.e2e.model;
//Enum to support only CSV and XLS file types
public enum FileTypeEnum {
    CSV("csv"),
    XLS("xls");
    public String type;

    FileTypeEnum(String type) {
    this.type=type;
    }
}