package restApi.services;

import restApi.entity.Weapon;
import restApi.repo.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    public List<Weapon> list() {
        return weaponRepository.findAll();
    }
}

