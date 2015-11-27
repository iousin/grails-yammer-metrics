/*
 * Copyright 2013 Jeff Ellis
 */

grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

metrics.core.version = "3.1.2"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }

    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        grailsRepo "http://grails.org/plugins"

    }

    dependencies {

        runtime "io.dropwizard.metrics:metrics-healthchecks:${metrics.core.version}"
        runtime "io.dropwizard.metrics:metrics-servlets:${metrics.core.version}"

    }

    plugins {
        build ':release:2.2.1', ':rest-client-builder:1.0.3', {
            export = false
        }

        build ":codenarc:0.19", {
            export = false
        }
    }

}
