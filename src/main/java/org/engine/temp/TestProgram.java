package org.engine.temp;

import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

@Service
public class TestProgram {

    public int[] solution(int inputNumber) {

        if (inputNumber < 6) {
            throw new RuntimeException("Input number should be greater then 5");
        }

        int[] res = new int[6];
        int min = 1;
        for (int i = 0; i < 6; i++) {
            int randomNumber = (int)(Math.random() * inputNumber) + min;
            res[i] = randomNumber;
            min = randomNumber;
        }
        return res;
    }

    public static int[] solution2(int inputNumber) {

        if (inputNumber < 6) {
            throw new RuntimeException("Input number should be greater then 5");
        }

        Set<Integer> set = new LinkedHashSet<>();
        Random rng = new Random();

        while (set.size() < 6) {
            Integer next = rng.nextInt(inputNumber) + 1;
            set.add(next);
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
