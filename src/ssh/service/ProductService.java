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

	//���淽��
	public String save(Product product){
		System.out.println("service��save��ִ�С�����");
		pDao.save(product);
		return null;
	}
}
