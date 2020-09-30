package com.dnstest.test;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;


import java.sql.SQLException;

import static com.dnstest.test.MainTest.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DNSTest {

    @Test
    public void test1DNSTest(){
        try {
            start();
            //Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2SearchTheBestAndCheckScore() throws SQLException {
        searchTheBest();
    }
}
