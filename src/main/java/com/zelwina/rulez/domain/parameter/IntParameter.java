package com.zelwina.rulez.domain.parameter;

public class IntParameter extends Parameter<Integer>{

    public IntParameter(String paramString) {
        super(paramString);
    }

    public Integer getFrom(){
        return Integer.valueOf(paramString);
    }
}
