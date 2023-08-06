package com.example.test

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("7", math?.add("3", "4"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("6", math?.add("3.0", "3"))
    }

    @Test
    fun doubleHardAdd() {
        assertEquals("3.6", math?.add("1.6", "2"))
    }

    @Test
    fun doubleDotAdd() {
        assertEquals("You have entered two points!", math?.add("5..4", "9"))
    }

    @Test
    fun doubleSymbolAdd() {
        assertEquals("Incorrect input!", math?.add("1fff8", "3"))
    }

    @Test
    fun doubleEmptyAdd() {
        assertEquals("You have not filled in the fields!", math?.add("", "7"))
    }

    @Test
    fun doubleSpaceAdd() {
        assertEquals("20", math?.add("1  2", " 8"))
    }


    @Test
    fun simpleDivide() {
        assertEquals("5", math?.divide("15", "3"))
    }


    @Test
    fun zeroDived() {
        assertEquals("Can't divide by zero!", math?.divide("5", "0"))
    }

    @After
    fun detach() {
        math = null
    }
}

