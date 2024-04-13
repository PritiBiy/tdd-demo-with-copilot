package com.copilot.demo.tdddemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TddDemoApplication

fun main(args: Array<String>) {
	runApplication<TddDemoApplication>(*args)
}
