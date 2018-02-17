package jaxrs

import org.glassfish.jersey.server.ResourceConfig

class Application : ResourceConfig() {
    init {
        packages("jaxrs.resources")
    }
}
