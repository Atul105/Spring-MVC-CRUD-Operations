package magar.atul.model;

import java.util.Date;

public class Product {
	
	// data properties
		private long id;
		private String name;
		private double price;
		private String desc;
		private Date createdAt;
		
		//constructor
		
		public Product(){}
		
		public Product(long id, String name, double price, String desc, Date createdAt) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.desc = desc;
			this.createdAt = createdAt;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + ", createdAt="
					+ createdAt + "]";
		}
		
		

}
