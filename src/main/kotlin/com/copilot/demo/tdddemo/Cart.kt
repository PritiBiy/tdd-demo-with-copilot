package com.copilot.demo.tdddemo

class Cart {
    private val items = mutableListOf<Item>()

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun add(item: Item) {
        items.add(item)
    }

    fun contains(item: Item): Boolean {
        return items.contains(item)
    }

    fun remove(item: Item) {
        items.remove(item)
    }

}
