package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Chunk {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,78,999,-1,456};
        int chunkSize = 3;

        int[][] chunked = chunk(input, chunkSize);

        Arrays.stream(chunked)
                .map(Arrays::toString)
                    .forEach(System.out::println);
    }
    public static int[][] chunk(int[] input, int chunkSize) {
        return IntStream.iterate(0, i -> i + chunkSize)
                .limit((long) Math.ceil((double) input.length / chunkSize))
                .mapToObj(j -> Arrays.copyOfRange(input, j, j + chunkSize > input.length ? input.length : j + chunkSize))
                .toArray(int[][]::new);
    }
}