
package nLayeredDemo;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerAdapter;
import nLayeredDemo.dataAcces.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService manager = new ProductManager(new HibernateProductDao(), new JLoggerAdapter());
		manager.add(new Product());
	}

}
