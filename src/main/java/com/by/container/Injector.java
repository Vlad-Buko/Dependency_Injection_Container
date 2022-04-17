package com.by.container;

import java.security.Provider;

public interface Injector {

    <T>Provider<T> getProvider(Class<T>type); // получение инстанса класса
    <T>void bind(Class<T> intf, Class<? extends T> impl); // регистрация байдинега по классу интерфейса и его реализация
    <T> void bindSingleton(Class <T> intf, Class<? extends T> impl); //  регистрация синглтон класса
}
