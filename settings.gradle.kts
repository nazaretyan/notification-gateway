pluginManagement {
    plugins {
        id("org.springframework.boot") version "3.2.0"
        id("io.spring.dependency-management") version "1.1.4"

        kotlin("jvm") version "1.9.20"
        kotlin("plugin.spring") version "1.9.20"
        kotlin("plugin.jpa") version "1.9.20"
    }
}

rootProject.name = "notification-gateway"

include("api:api-application")