package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.JLogger.IJLogger;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
ProductDao productDao;
LoggerService  adapter;
public ProductManager(ProductDao productDao ,LoggerService  adapter) {
	super();
	this.productDao = productDao;
	this.adapter=adapter;
	
}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if (product.getId()==1) {
			System.out.println("bu id de üürün eklenemez");
			return;			
		}
		productDao.add(product);
		adapter.log("jlogger ile ekleme işlemi loglandı");
	}

	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		return null;
	}



}
