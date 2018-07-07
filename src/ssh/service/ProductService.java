package ssh.service;

import org.springframework.transaction.annotation.Transactional;

import ssh.dao.ProductDao;
import ssh.pojo.Product;
@Transactional
public class ProductService {

	private ProductDao pDao;
	
	public ProductDao getpDao() {
		return pDao;
	}

	public void setpDao(ProductDao pDao) {
		this.pDao = pDao;
	}

	//保存方法
	public String save(Product product){
		System.out.println("service的save被执行。。。");
		pDao.save(product);
		return null;
	}
}
