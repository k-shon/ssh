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

	//���淽��
	public String save(){
		System.out.println("action��save��ִ�С�����");
		pService.save(product);
		return null;
	}
}
