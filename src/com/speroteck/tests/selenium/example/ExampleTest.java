package com.speroteck.tests.selenium.example;

import com.thoughtworks.selenium.*;

import junit.framework.TestCase;

public class ExampleTest extends TestCase {

    public DefaultSelenium selenium;

    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://google.com/");
        selenium.start();
    }

    public void testSeleniumTitlehomePage() throws Exception {
        selenium.open("/");
        assertEquals("Google", selenium.getTitle());
    }

    public void tearDown() throws Exception {
        selenium.stop();
    }

}