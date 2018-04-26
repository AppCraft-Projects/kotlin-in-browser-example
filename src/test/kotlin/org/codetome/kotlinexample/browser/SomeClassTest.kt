package org.codetome.kotlinexample.browser

import kotlin.test.Test
import kotlin.test.assertEquals

class SomeClassTest {

    @Test
    fun testFoo() {

        val expected = "bar"

        assertEquals(SomeClass(expected).getFoo(), expected)
    }
}
