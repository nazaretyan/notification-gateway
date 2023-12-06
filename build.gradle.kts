import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
	id("org.springframework.boot") apply false
	id("io.spring.dependency-management")

	kotlin("jvm") apply false
	kotlin("plugin.spring") apply false
	kotlin("plugin.jpa") apply false
}

allprojects {
	group = "com.example.notification"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}
}

subprojects {
	apply {
		plugin("io.spring.dependency-management")

		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.jetbrains.kotlin.plugin.spring")
		plugin("org.jetbrains.kotlin.plugin.jpa")
	}

	dependencyManagement {
		imports {
			mavenBom(SpringBootPlugin.BOM_COORDINATES)
		}
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs += "-Xjsr305=strict"
			jvmTarget = "21"
		}
	}

	tasks.withType<Test>(Test::useJUnitPlatform)
}
