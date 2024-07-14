package com.bebz.grades

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
//Se agrega lo siguiente
@EnableDiscoveryClient
class GradesApplication

fun main(args: Array<String>) {
	runApplication<GradesApplication>(*args)
}
