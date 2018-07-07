package ssh.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ssh.pojo.Product;

//使用hibernate模板
public class ProductDao extends HibernateDaoSupport{

	//保存方法
	public String save(Product product){
		System.out.println("dao的save被执行。。。");
		this.getHibernateTemplate().save(product);
		return null;
	}
}
