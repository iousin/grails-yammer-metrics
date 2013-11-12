package org.grails.plugins.metrics.groovy

import com.codahale.metrics.health.HealthCheckRegistry
import com.codahale.metrics.servlets.HealthCheckServlet

class HealthCheckServletContextInitializer extends HealthCheckServlet.ContextListener {

    public final HealthCheckRegistry healthCheckRegistry = new HealthCheckRegistry()

    @Override
    protected HealthCheckRegistry getHealthCheckRegistry() {
        return healthCheckRegistry
    }
}