package com.bebz.students

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

//Se agrega lo siguiente
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = ["com.bebz.students.feignclients"])
class StudentsApplication

fun main(args: Array<String>) {
	runApplication<StudentsApplication>(*args)
}
