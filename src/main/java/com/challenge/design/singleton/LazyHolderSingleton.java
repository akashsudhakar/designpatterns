package com.challenge.design.singleton;

public class LazyHolderSingleton {
    private LazyHolderSingleton() {
    }

    private static class LazyHolder {
        static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
