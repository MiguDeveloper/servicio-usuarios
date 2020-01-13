package pe.tuna.serviciousuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import pe.tuna.serviciousuariocommons.models.entity.Rol;
import pe.tuna.serviciousuariocommons.models.entity.Usuario;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Usuario.class, Rol.class);
    }

}
