package magar.atul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import magar.atul.dao.ProductDao;
import magar.atul.model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value="/list-products", method=RequestMethod.GET)
	public ModelAndView listAllProducts() {
		ModelAndView mv = new ModelAndView("list-products");
		List<Product> list = productDao.getProducts();
		mv.addObject("list", list);
		return mv;
	}
	
	//add_product
	//load_page
	@RequestMapping(value="/add-product", method=RequestMethod.GET)
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView("add-product");
		Product product = new Product();
		mv.addObject("product", product);
		return mv;
	}
	
	//save_product
		@RequestMapping(value="/add-product", method=RequestMethod.POST)
		public ModelAndView submitProduct(@ModelAttribute("product") Product product) {
			ModelAndView mv = new ModelAndView("success-response");
			productDao.addProduct(product);
			mv.addObject("action", "created");
			return mv;
		}
}
