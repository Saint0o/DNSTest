package com.dnstest.test;

import org.junit.jupiter.api.Test;


import static com.dnstest.test.MainTest.*;

public class DNSTest {
    @Test
    public void dnsTest(){
        try {
            start();
            //Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
