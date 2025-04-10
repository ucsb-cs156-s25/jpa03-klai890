package edu.ucsb.cs156.example.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * The `OpenAPIConfig` class is annotated with OpenAPI definitions including
 * information about the API
 * and server configuration.
 */
@OpenAPIDefinition(info = @Info(title = "CMPSC 156, jpa03", description = """
    <p><a href='/'>Home Page</a></p>
    <p><a href='/h2-console'>H2 Console (only on localhost)</a></p>
    <p><a href='/login'>login</a></p>
    <p><a href='/logout'>logout</a></p>
    """), servers = @Server(url = "/"))
class OpenAPIConfig {
}