package com.huwei.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest
@ComponentScan(basePackages = "com.huwei")
public abstract class testone {
    Logger logger = LoggerFactory.getLogger(this.getClass());
} 