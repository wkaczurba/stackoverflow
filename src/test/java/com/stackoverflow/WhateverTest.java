package com.stackoverflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class WhateverTest {

    @Autowired
    YourInterface objectUnderTest;

    @Test
    public void test1() {
        assertTrue(objectUnderTest.func());
    }
}
