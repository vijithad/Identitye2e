package com.identity.e2e.cuke;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private static final Map<String, Object> map = new HashMap<>();
    private static final ThreadLocal<Map<String, Object>> threadLocalMap = new ThreadLocal<>();

    public static void init() {
        threadLocalMap.set(map);
    }

    public static void destroy() {
        threadLocalMap.remove();
    }

    public static void set(String name, Object value) {
        map.put(name, value);
    }

    public static <T> T get(String name, Class<T> type) {
        return type.cast(map.get(name));
    }

}
