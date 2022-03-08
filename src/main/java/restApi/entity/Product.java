package restApi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
    @Column(name = "name")
    private String productName;

    @Column(name = "detail")
    private String productDetail;
    @Column(name = "price")
    private int productPrice;
    @Column(name = "status")
    private String productStatus;
    public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Long id, String productName, String productDetail, int productPrice,String productStatus) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDetail = productDetail;
		this.productPrice = productPrice;
		this.productStatus=productStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDetail=" + productDetail
				+ ", productPrice=" + productPrice + ", productStatus=" + productStatus + "]";
	}
}
