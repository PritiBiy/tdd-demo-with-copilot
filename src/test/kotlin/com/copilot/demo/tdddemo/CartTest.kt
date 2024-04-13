package com.copilot.demo.tdddemo

import org.junit.jupiter.api.Test

class CartTest {

    //should be empty when created, do not add comments
    @Test
    fun `should be empty when created`() {
        val cart = Cart()
        assert(cart.isEmpty())
    }


}