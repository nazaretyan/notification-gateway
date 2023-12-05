package com.example.notification.gateway.rest.endpoint

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class TestEndpoint {

    @GetMapping("/test")
    fun test(): List<String> = listOf(UUID.randomUUID().toString())
}