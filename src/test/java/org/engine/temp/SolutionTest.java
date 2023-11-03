package org.engine.temp;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private static final Solution solution = new Solution();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mostWordsFound() {

        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int res = solution.mostWordsFound(sentences);

        Assert.assertEquals(6, res);
    }

    @Test
    public void mostWordsFound2() {

        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this  is great thanks very much"};

        int res = solution.mostWordsFound(sentences);

        Assert.assertEquals(6, res);
    }
}