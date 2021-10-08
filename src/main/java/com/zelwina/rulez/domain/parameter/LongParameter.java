package com.zelwina.rulez.domain.parameter;

public class LongParameter extends Parameter<Long>{


    public LongParameter(String paramString) {
        super(paramString);
    }

    public Long getFrom(){
        return Long.valueOf(paramString);
    }
}
