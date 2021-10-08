package com.zelwina.rulez.domain.parameter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringParameter extends Parameter<String>{

    public StringParameter(String paramString) {
        super(paramString);
    }

    @Override
    String getFrom() {
        return valueString;
    }
}
