package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReturnDuplicate {
    public static void main(String[] args) {
        // 3, 4, 9
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        Set<Integer> result = findDuplicateBySetAdd(list);
        for (Integer integer : result) System.out.println(integer);
    }

    public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {
    // Set.add() returns false if the element was already in the set.
        Set<T> items = new HashSet<>();
        return list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
    }
}
