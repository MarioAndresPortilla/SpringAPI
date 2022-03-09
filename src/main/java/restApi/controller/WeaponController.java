package restApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import restApi.entity.Weapon;
import restApi.entity.Weapon;
import restApi.exception.WeaponException;
import restApi.exception.WeaponException;
import restApi.repo.WeaponRepository;
import restApi.repo.WeaponRepository;

@RestController
@RequestMapping("api")
public class WeaponController {

	@Autowired
	private WeaponRepository repo;

	// Get All weapons
	@GetMapping("weapons")
	public List<Weapon> getAllWeapons() {
		return repo.findAll();

	}

	// Create a new weapons
	@PostMapping("weapons")
	public Weapon createWeapon(@RequestBody Weapon weapon) {
		return repo.save(weapon);
	}

	// Get a Single weapon
	@GetMapping("weapons/{id}")
	public Weapon getWeaponById(@PathVariable(value = "id") Long weaponId) {
		return repo.findById(weaponId).orElseThrow(() -> new WeaponException("Weapon", "id", weaponId));
	}

	// Update a weapon
	@PutMapping("weapons/{id}")
	public Weapon updateWeapon(@PathVariable(value = "id") Long weaponId, @RequestBody Weapon weaponDescription) {

		Weapon weapon = repo.findById(weaponId).orElseThrow(() -> new WeaponException("Weapon", "id", weaponId));

		weapon.setWeaponName(weaponDescription.getWeaponName());
		weapon.setWeaponStatus(weaponDescription.getWeaponStatus());
		weapon.setWeaponDescription(weaponDescription.getWeaponDescription());
		weapon.setWeaponPrice(weaponDescription.getWeaponPrice());

		Weapon updatedWeapon = repo.save(weapon);
		return updatedWeapon;
	}

	// Delete a weapon
	@DeleteMapping("weapons/{id}")
	public ResponseEntity<?> deleteWeapon(@PathVariable(value = "id") Long weaponId) {
		Weapon weapon = repo.findById(weaponId).orElseThrow(() -> new WeaponException("Weapon", "id", weaponId));

		repo.delete(weapon);

		return ResponseEntity.ok().build();
	}
	/*
	 * @RequestMapping("/weapons") public String viewweapons(Model model) {
	 * model.addAttribute("viewweapons", weaponService.getAllweapons()); return
	 * "/prod/weapons"; }
	 * 
	 * @GetMapping("/deleteweapon/{id}") public String
	 * deleteweapon(@PathVariable(value = "id") long id) {
	 * this.weaponService.deleteweapon(id); return "redirect:/weapons"; }
	 * 
	 * @GetMapping("/selectweapon/{id}") public String
	 * selectweapon(@PathVariable(value = "id") long id, Model model) { String
	 * status = weaponService.getOne(id); if (status.contains("selected")) { return
	 * "redirect:/weapons?failed"; } else { weaponService.updateweaponStatus(id);
	 * return "redirect:/weapons?success";
	 * 
	 * }
	 * 
	 * }
	 */

}