package ssh.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ssh.pojo.Product;

//ʹ��hibernateģ��
public class ProductDao extends HibernateDaoSupport{

	//���淽��
	public String save(Product product){
		System.out.println("dao��save��ִ�С�����");
		this.getHibernateTemplate().save(product);
		return null;
	}
}
