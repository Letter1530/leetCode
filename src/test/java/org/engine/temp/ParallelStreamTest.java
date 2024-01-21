package org.engine.temp;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ParallelStreamTest {

    @Test
    public void test1() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> added10s = new ArrayList<>();

        numbers.parallelStream()
                .filter(number -> {
                    if (number > 5) {
                        added10s.add(number + 10);
                    }
                    return number > 5;
                })
                .forEachOrdered(System.out::println);
        log.info("added10s:{}", added10s);
    }

    @Test
    public void test2() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> biggerThan5s = numbers.parallelStream()
                .filter(number -> number > 5)
                .collect(Collectors.toList());

        biggerThan5s.forEach(System.out::println);

        List<Integer> added10s = biggerThan5s.parallelStream()
                .map(number -> number + 10)
                .collect(Collectors.toList());

        log.info("added10s:{}", added10s);

    }
}
