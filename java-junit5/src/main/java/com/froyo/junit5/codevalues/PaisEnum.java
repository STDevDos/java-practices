package com.froyo.junit5.codevalues;

public enum PaisEnum {

    MEXICO{
        @Override
        String retrieveLenguage() {
            return "spanish";
        }
    },
    ESTADOS_UNIDOS {
        @Override
        String retrieveLenguage() {
            return "english";
        }
    };

    abstract String retrieveLenguage();

}
