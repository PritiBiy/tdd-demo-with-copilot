package com.copilot.demo.tdddemo

import org.junit.jupiter.api.Test

class CartTest {

    //should be empty when created, do not add comments
    @Test
    fun `should be empty when created`() {
        val cart = Cart()
        assert(cart.isEmpty())
    }

    //should not be empty after adding an item with new Item with name and quantity, do not add comments
    @Test
    fun `should not be empty after adding an item with new Item with name and quantity`() {
        val cart = Cart()
        cart.add(Item("item1", 1))

        assert(!cart.isEmpty())
    }

}