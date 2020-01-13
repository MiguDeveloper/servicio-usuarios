package pe.tuna.serviciousuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"pe.tuna.serviciousuariocommons.models.entity"})
@SpringBootApplication
public class ServicioUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioUsuariosApplication.class, args);
    }

}
