package com.stock.joyas.cons;

public enum LangCons {
    EN("EN"),
    FR("FR"),
    ES("ES");

    private final String code;

    LangCons(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }
}

