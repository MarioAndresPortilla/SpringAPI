package restApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restApi.entity.Weapon;


@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long>{
}
