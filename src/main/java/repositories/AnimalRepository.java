package repositories;

import entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT DISTINCT animal.color FROM Animal animal") //HQL
    List<String> findDistinctByColor();

    List<Animal> findByNombreContaining(String nombre);

    List<Animal> findByColor(String color);

    List<Animal> findAnimalesByEdadBetween(Integer edadDesde, Integer edadHasta);
}



