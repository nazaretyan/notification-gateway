package com.example.notification.gateway.rest

import com.example.notification.gateway.common.YamlPropertySourceFactory
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.env.YamlPropertySourceLoader
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@EnableConfigurationProperties
@PropertySource("classpath:/api-rest.yaml", factory = YamlPropertySourceFactory::class)
class ApiRestConfiguration