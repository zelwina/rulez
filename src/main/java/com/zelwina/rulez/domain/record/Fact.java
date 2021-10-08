package com.zelwina.rulez.domain.record;

import com.zelwina.rulez.domain.parameter.Parameter;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default;
import net.bytebuddy.pool.TypePool.ClassLoading;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.util.Assert;

public interface Fact {

    default DynamicType.Builder<Fact> getFactClassBuilder(final String name){
        Assert.notNull(name, "name cannot be null");

        try {
            Class.forName(name);
            throw new IllegalStateException(name + " class already loaded");
        } catch (ClassNotFoundException | ClassCastException ex) {

           return new ByteBuddy()
                    .subclass(Fact.class);
        }

    }

    default <T> DynamicType.Builder<Fact> withConstructorParameter(final Parameter<T> parameter, final DynamicType.Builder<Fact> factBuilder){
        return factBuilder;
    }

    default Class<? extends Fact> from(final JSONObject jsonObject) throws JSONException {
        final String className = jsonObject.getString("className");

        DynamicType.Builder<? extends Fact> builder = new ByteBuddy()
                .subclass(Fact.class);

        return
    }
}
