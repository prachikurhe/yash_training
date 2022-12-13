package com.example.nikhil.controller;


import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.nikhil.exception.ProductNotFoundException;
import com.example.nikhil.model.Product;
import com.example.nikhil.service.ProductService;
import com.example.nikhil.validator.ProductValidator;
   
 
@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductValidator productValidator;
	
	@Autowired
	ProductService productService;
	
	 @InitBinder
	 public void initBinder(WebDataBinder binder) {
		 binder.setValidator(productValidator);
	 }
	
	
	@RequestMapping(method = RequestMethod.GET , value="/all")
	public String getAllProducts(ModelMap model){
          model.addAttribute("products", productService.getAllProducts());
          return "allProducts";
    }
	
	@RequestMapping(method = RequestMethod.GET , value="/all/{category}")
	public String getAllProductsByCategory(ModelMap model , @PathVariable("category") String category){
          model.addAttribute("products", productService.getAllProductsByCategory(category));
          return "allProducts";
    }
	
	@RequestMapping(method = RequestMethod.GET , value="/get")
	public String getAllProducts(ModelMap model , @RequestParam("id") String id){
          model.addAttribute("product", productService.getProductById(id));
          return "oneProduct";
    }
	
	@RequestMapping(method = RequestMethod.GET , value="/add")
	public String displayAddProductForm(ModelMap model) {
		Product p1 = new Product();
		p1.setName("my product");
		model.addAttribute("newProduct", p1);
		
		return "addProduct";
	   	
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/add")
	public String addProduct(@Valid @ModelAttribute("newProduct") Product product , BindingResult result , HttpServletRequest request) {
		   if(result.hasErrors())
			   return "addProduct";
		   MultipartFile productImage=product.getProductImage();
		   productService.addProduct(product);
		   String rootDirectory=request.getSession().getServletContext().getRealPath("/");
		   try {
			   productImage.transferTo(new File(rootDirectory+"resources\\images\\"+product.getProductId()+".png"));
		   }catch(Exception ex) {}
		   return "redirect:/products/all";
	   	
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handleProductNotFoundException(ProductNotFoundException ex , HttpServletRequest request) {
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("message" , ex.getMessage());
		 mv.addObject("URL" , request.getRequestURL()+"?"+request.getQueryString());
		 mv.setViewName("productNotFound");
		 return mv;
	}
}
 