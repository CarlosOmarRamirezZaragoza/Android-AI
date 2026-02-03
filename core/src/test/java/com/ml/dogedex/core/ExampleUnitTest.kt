package com.ml.dogedex.core

import org.junit.Test
import org.junit.Assert.*

/**
 * Unit Test to validate the pipeline from CI.
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    
    @Test
    fun testKeyPlaceholder() {
        val dummy = "check"
        assertNotNull(dummy)
    }
}
