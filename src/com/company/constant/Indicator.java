package com.company.constant;

public enum Indicator{

    VALID_IND_YES(1,"有效"),VALID_IND_NO(2,"无效");

    private int code;

    Indicator(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    private  String label;

}
