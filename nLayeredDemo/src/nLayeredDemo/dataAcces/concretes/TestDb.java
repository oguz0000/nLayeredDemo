package nLayeredDemo.dataAcces.concretes;

import java.util.List;

import nLayeredDemo.dataAcces.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class TestDb implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("test yapıldı işlem başarılı");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("test yapıldı işlem başarılı");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("test yapıldı işlem başarılı");
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		System.out.println("test yapıldı işlem başarılı");
		return null;
	}

	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		System.out.println("test yapıldı işlem başarılı");
		return null;
	}

}
