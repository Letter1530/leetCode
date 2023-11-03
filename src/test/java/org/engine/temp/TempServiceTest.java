package org.engine.temp;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class TempServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1() {

        int a = 1;
        int b = 2;

        int res = TempService.test(a, b);
        log.info("res:{}", res);
    }

    @Test
    public void test2() {

        String a = "String";
        String b = "String";
        String c = new String("String");

        log.info("res1:{}", a == b);
        log.info("res2:{}", a  == c);
    }
}