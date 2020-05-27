package com.hyf.design.singleton.v5;

public enum EnumSingleton {
    ENUM_SINGLETON;

    public static void main(String[] args) {
        System.out.println(EnumSingleton.ENUM_SINGLETON.equals(EnumSingleton.ENUM_SINGLETON));
    }
}
