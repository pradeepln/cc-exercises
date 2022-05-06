package exercise06.solved;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductDTO {

	@JsonIgnore
	private Product entity ;
	
	public ProductDTO() {
		entity = new Product();
	}

	public ProductDTO(Product entity) {
		super();
		this.entity = entity;
	}

	public int getPid() {
		return entity.getId();
	}

	public void setPid(int id) {
		entity.setId(id);
	}

	public String getName() {
		return entity.getName();
	}

	public void setName(String name) {
		entity.setName(name);
	}

	public float getPrice() {
		return entity.getPrice();
	}

	public void setPrice(float price) {
		entity.setPrice(price);
	}
	
	public Product toEntity() {
		return entity;
	}
}
