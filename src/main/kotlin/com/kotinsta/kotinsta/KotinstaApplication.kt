package com.kotinsta.kotinsta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotinstaApplication

fun main(args: Array<String>) {
    runApplication<KotinstaApplication>(*args)
}
