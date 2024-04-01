## OpenAPIGenerator01 - using Spring Boot Libraries

This module contains articles about various Spring Boot libraries

### Relevant Articles:

- [Background Jobs in Spring with JobRunr](https://www.baeldung.com/java-jobrunr-spring)
- [Open API Server Implementation Using OpenAPI Generator](https://www.baeldung.com/java-openapi-generator-server)
- [An Introduction to Kong](https://www.baeldung.com/kong)
- [Scanning Java Annotations at Runtime](https://www.baeldung.com/java-scan-annotations-runtime)
- [Guide to Resilience4j With Spring Boot](https://www.baeldung.com/spring-boot-resilience4j)  
- [Using OpenAI ChatGPT APIs in Spring Boot](https://www.baeldung.com/spring-boot-chatgpt-api-openai)
- [Introduction to Spring Modulith](https://www.baeldung.com/spring-modulith)
- More articles: [[prev -->]](/spring-boot-modules/spring-boot-libraries)


mvn clean install

[ERROR] Failed to execute goal org.openapitools:openapi-generator-maven-plugin:7.3.0:
generate (default) on project spring-boot-openapi: 
Execution default of goal org.openapitools:openapi-generator-maven-plugin:7.3.0:
generate failed: Unable to load the mojo 'generate' in the plugin 
'org.openapitools:openapi-generator-maven-plugin:7.3.0' due to an API incompatibility:
org.codehaus.plexus.component.repository.exception.ComponentLookupException: org/openapitools/codegen/plugin/CodeGenMojo 
has been compiled by a more recent version of the Java Runtime (class file version 55.0), 
this version of the Java Runtime only recognizes class file versions up to 52.0
[ERROR] -----------------------------------------------------
[ERROR] realm =    plugin>org.openapitools:openapi-generator-maven-plugin:7.3.0