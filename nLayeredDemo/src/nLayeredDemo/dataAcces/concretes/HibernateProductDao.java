package nLayeredDemo.dataAcces.concretes;

import java.util.List;

import nLayeredDemo.dataAcces.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile eklendi " +product.getName());
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("güncellendi "+product.getName());
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("silindi "+product.getName());
	}
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setId(1);
		return product;
	}

	@Override
	public List<Product> getall(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
