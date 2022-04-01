package com.kstore.estoque.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info =
@Info(title = "Estoque Service Api",
        version = "v1",
        description = "Documentação swagger de Estoque Service API"))
public class OpenApiSwaggerUiConfiguration {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI().components(new Components()).info( new io.swagger.v3.oas.models.info.Info()
                .title("Estoque API")
                .version("v1")
                .license(new License().name("Apache 2.0").url("http://springdoc.org/%22")));
    }

}
