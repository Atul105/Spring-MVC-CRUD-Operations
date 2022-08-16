package magar.atul.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import magar.atul.model.Product;

public class ProductDao {

	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	// list all products
		public List<Product> getProducts() {
			List<Product> productsList = template.query("select * from product_data", new RowMapper<Product>() {
				public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
					Product product = new Product();
					product.setId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setPrice(rs.getDouble(3));
					product.setCreatedAt(rs.getDate(4));
					return product;
				}
			});
			return productsList;
		}
		
	//create product
		
		public int addProduct(Product product) {
			
			String ADD_PRODUCT= "INSERT into product_data(name, price) values ( ? , ?)";
			return template.update(ADD_PRODUCT, product.getName(), product.getPrice());
		}
		
		
}
