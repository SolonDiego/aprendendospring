package br.com.solondiego.aprendendospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket pessoaApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.solondiego.aprendendospring"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Pessoas API Rest",
                "API Rest de cadastro de pessoas",
                "1.0",
                "Termos de Serviços",
                new Contact("Solon Diego Garcia Moreira", "https://www.solondiego.com.br", "sdiegogm@gmail.com"),
                "Apache license Version 2.0",
                "http://www.apache.org/license.html",
                new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
