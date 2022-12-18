package com.stock.joyas.cons;

public enum LangCons {
    EN("en"),
    FR("fr"),
    ES("es");

    private final String code;

    LangCons(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }
}
