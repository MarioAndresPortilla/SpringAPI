package restApi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "weapon")
public class Weapon implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
    @Column(name = "name")
    private String weaponName;

    @Column(name = "description")
    private String weaponDescription;
    @Column(name = "price")
    private int weaponPrice;
    @Column(name = "status")
    private String weaponStatus;
    public Weapon() {
		// TODO Auto-generated constructor stub
	}
	public Weapon(Long id, String weaponName, String weaponDescription, int weaponPrice,String weaponStatus) {
		super();
		this.id = id;
		this.weaponName = weaponName;
		this.weaponDescription = weaponDescription;
		this.weaponPrice = weaponPrice;
		this.weaponStatus=weaponStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public String getWeaponDescription() {
		return weaponDescription;
	}
	public void setWeaponDescription(String weaponDescription) {
		this.weaponDescription = weaponDescription;
	}
	public int getWeaponPrice() {
		return weaponPrice;
	}
	public void setWeaponPrice(int weaponPrice) {
		this.weaponPrice = weaponPrice;
	}
	public String getWeaponStatus() {
		return weaponStatus;
	}
	public void setWeaponStatus(String weaponStatus) {
		this.weaponStatus = weaponStatus;
	}

	@Override
	public String toString() {
		return "Weapon [id=" + id + ", weaponName=" + weaponName + ", weaponDescription=" + weaponDescription
				+ ", weaponPrice=" + weaponPrice + ", weaponStatus=" + weaponStatus + "]";
	}
}
