package com.zelwina.rulez.domain.parameter;

public class DoubleParameter extends Parameter<Double>{

    public DoubleParameter(String paramString) {
        super(paramString);
    }

    public Double getFrom(){
        return Double.valueOf(paramString);
    }
}
