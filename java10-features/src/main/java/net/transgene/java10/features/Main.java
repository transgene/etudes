package net.transgene.java10.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Main {

//    private var varInt = 13;

    public static void main(String[] args) {
        var str = "woah";
        System.out.println(str instanceof String);
        var map = new ConcurrentHashMap<String, AtomicBoolean>();
        System.out.println(map.getClass());

        System.out.println();

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(7);
        List<Integer> immutInts = List.copyOf(ints);
        Set<Object> t = immutInts.stream().map(integer -> integer.toString()).collect(Collectors.toUnmodifiableSet());
        var empty = Optional.empty();
        try {
            empty.orElseThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
