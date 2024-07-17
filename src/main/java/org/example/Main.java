package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Object[] array = {"first", "second", "second", "third", "third"};
        getMapFromArray(array).forEach((k, v) -> System.out.println("Key: " + k + "," + " Value: " + v));
    }

    private static Map<Object,Integer> getMapFromArray(Object[] array) {
        Map<Object, Integer> resultMap = new HashMap<>();
        for (Object element : array) {
            resultMap.put(element, resultMap.getOrDefault(element, 0) + 1);
        }
        return resultMap;
    }
}