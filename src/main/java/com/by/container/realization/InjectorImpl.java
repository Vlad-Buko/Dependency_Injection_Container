package com.by.container.realization;

import com.by.container.Injector;

import java.security.Provider;

/**
 * Created by Vladislav Domaniewski
 */

public class InjectorImpl implements Injector {
    @Override
    public <T> Provider getProvider(Class<T> type) {
        return null;
    }

    @Override
    public <T> void bind(Class<T> intf, Class<? extends T> impl) {

    }

    @Override
    public <T> void bindSingleton(Class<T> intf, Class<? extends T> impl) {

    }
}
