FROM openjdk:19-jdk as builder
WORKDIR app
ADD build/libs/programming-challenge-bootstrap-latest-SNAPSHOT.jar app.jar

# this is leveraging the oci abilities from spring-boot
# extract the fatjar as its individual layers (spring-plugin magic)
RUN java -Djarmode=layertools -jar app.jar extract

FROM openjdk:19-jdk

WORKDIR app
# add the invidividual layers to the docker image, in order of least used
# so if we havent added any dependencies, then that layer will be cached
COPY --from=builder app/dependencies/ ./
COPY --from=builder app/snapshot-dependencies/ ./
COPY --from=builder app/spring-boot-loader/ ./
COPY --from=builder app/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
