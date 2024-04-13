package com.copilot.demo.tdddemo

class Cart {
    private val items = mutableListOf<Item>()

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun addItem(item: Item) {
        items.add(item)
    }

}
