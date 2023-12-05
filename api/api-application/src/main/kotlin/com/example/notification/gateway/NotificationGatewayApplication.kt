package com.example.notification.gateway

import com.example.notification.gateway.rest.ApiRestConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(ApiRestConfiguration::class)
class NotificationGatewayApplication

fun main(args: Array<String>) {
	runApplication<NotificationGatewayApplication>(*args)
}
