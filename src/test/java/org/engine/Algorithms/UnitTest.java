package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class UnitTest {

    @Before
    public void before() {

    }

    @After
    public void after() {

    }

    @Test
    public void test1() {
        int i = 0;
        int j = 0;
        log.info("i:" + i + ",j:" + j);
        int a = i++;
        int b = ++j;
        log.info("a:{},b:{}", a, b);
        log.info("i:{},j:{}", i, j);
    }

    @Test
    public void test2() {
        String a = "AB C  DEF   ";
        log.info("a:{}", a.trim());
    }
}