package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = sentence.toLowerCase().split("\\W+");
        if (sentence == "") {
            return map;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                } else {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
        }
        return map;
    }
}
