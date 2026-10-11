package pe.edu.cibertec.discoveryservergrupo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerGrupo10Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerGrupo10Application.class, args);
    }
}
