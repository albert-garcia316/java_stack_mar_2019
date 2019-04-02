package com.albertgarcia.categoriesproducts.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.albertgarcia.categoriesproducts.models.Category;
import com.albertgarcia.categoriesproducts.models.CategoryProduct;
import com.albertgarcia.categoriesproducts.models.Product;
import com.albertgarcia.categoriesproducts.repositories.CategoryProductRepository;
import com.albertgarcia.categoriesproducts.repositories.CategoryRepository;
import com.albertgarcia.categoriesproducts.repositories.ProductRepository;

@Service
public class CategoryProductService {
	private final CategoryRepository cR;
	private final ProductRepository pR;
	private final CategoryProductRepository catProRepo;
	public CategoryProductService(CategoryRepository cR, ProductRepository pR, CategoryProductRepository catProRepo) {
		this.cR = cR;
		this.pR = pR;
		this.catProRepo = catProRepo;
	}
	
//	categories
	public Category createCategory(Category category) {
		return cR.save(category);
	}
	public Category findCategory(Long id) {
		Optional<Category> optCat = cR.findById(id);
		if(optCat.isPresent()) {
			return optCat.get();
		}
		return null;
	}
	public List<Category> findAllCategories() {
		return cR.findAll();
	}
	


	
//	Products
	public Product createProduct(Product product) {
		return pR.save(product);
	}
	public Product findProduct(Long id) {
		Optional<Product> opt = pR.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	public List<Product> findAllProducts() {
		return pR.findAll();
	}

	public void addCategoryToProduct(CategoryProduct catPro) {
		catProRepo.save(catPro);
		
	}

	public List<Category> findAllOtherCategories(Product p) {
		List<Category> myCat = p.getCategories();
		if(myCat.size() == 0) {
			return cR.findAll();
		} else {
			List<Long> myCatIds = new ArrayList<>();
			for(Category c : myCat) {
				myCatIds.add(c.getId());
			}
			return cR.findByIdNotIn(myCatIds);
		}
	}

	public void addProductToCategory(CategoryProduct catPro) {
		catProRepo.save(catPro);
	}

	public List<Product> findAllOtherProducts(Category c) {
		List<Product> myPro = c.getProducts();
		if(myPro.size() == 0) {
			return pR.findAll();
		} else {
			List<Long> myProIds = new ArrayList<>();
			for(Product p : myPro) {
				myProIds.add(p.getId());
			}
			return pR.findByIdNotIn(myProIds);
		}
	}
}
