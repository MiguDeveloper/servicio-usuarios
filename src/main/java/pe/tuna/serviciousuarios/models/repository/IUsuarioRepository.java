package pe.tuna.serviciousuarios.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import pe.tuna.serviciousuariocommons.models.entity.Usuario;

// IMPORTANTE: Al exponer de esta manera el repository debemos de tener en cuenta que para consumir los metodos definidos
// por el usuario debemos de acceder a traves de '.../search/' por ejemplo: '.../search/findByUsername?username=miguel'
// podemos personalizar las rutas y sobre escribir la ruta con @RestResource en cualquiera de los casos
@RepositoryRestResource(path = "usuarios")
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    // Usando nombre del metodo: queryMethod
    @RestResource(path = "buscar-username")
    public Usuario findByUsername(String username);

    // Ahota usando query
    @Query("SELECT u FROM Usuario u WHERE u.username = ?1")
    public Usuario obtenerPorUsername(String username);

    // Realizando una consulta con SQL nativo
    @Query(value = "SELECT * FROM usuarios WHERE username = ?1", nativeQuery = true)
    public Usuario nativeQueryGetUsername(String username);
}
