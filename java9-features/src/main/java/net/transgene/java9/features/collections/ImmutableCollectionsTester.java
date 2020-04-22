package net.transgene.java9.features.collections;

import net.transgene.java9.features.varhandle.VarHandleSubject;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ImmutableCollectionsTester {

    public void testAndPrint() {
        List<Integer> integers = List.of(1, 2, 4);
        Set<Object> objects = Set.of("1", 2, 3L, new VarHandleSubject());
        Map<String, Integer> stringIntegerMap = Map.ofEntries(Map.entry("key", 1), Map.entry("key2", 2));

        List<Integer> intsFromOptionals = List.of(Optional.of(1), Optional.of(3), Optional.of(-1)).stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }
}
