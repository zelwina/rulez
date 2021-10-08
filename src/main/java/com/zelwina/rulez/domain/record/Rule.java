package com.zelwina.rulez.domain.record;

import java.util.function.Function;

public interface Rule<F extends Fact> extends Function<F, Boolean> {


}
