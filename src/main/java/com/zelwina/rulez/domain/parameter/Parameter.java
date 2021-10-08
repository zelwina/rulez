package com.zelwina.rulez.domain.parameter;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public abstract class Parameter<T> {

    protected final String paramString;
    protected final String paramName;
    protected final String valueString;

    public Parameter(final String paramString){
        this.paramString = paramString;
        String[] split = paramString.split(":");
        this.paramName = split[0];
        this.valueString = Arrays.stream(split).skip(1).collect(Collectors.joining());
    }

    abstract T getFrom();

    public String getName(final String paramString){
        return paramName;
    }
}
