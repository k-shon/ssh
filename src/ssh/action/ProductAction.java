package ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ssh.pojo.Product;
import ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	private ProductService pService;
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	public ProductService getproductService() {
		return pService;
	}

	public void setpService(ProductService pService) {
		this.pService = pService;
	}

	//保存方法
	public String save(){
		System.out.println("action的save被执行。。。");
		pService.save(product);
		return null;
	}
}
