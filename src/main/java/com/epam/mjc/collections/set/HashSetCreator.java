package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer i : sourceList) {
            if (i % 2 != 0) {
                hashSet.add(i);
                hashSet.add(i * 2);
            } else {
                while (i % 2 == 0) {
                    hashSet.add(i);
                    i /= 2;
                }
                hashSet.add(i);
            }
        }

        return hashSet;
    }
}
