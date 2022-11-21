package com.swapnil.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.swapni.model.Product;
import com.swapnil.entityUtil.EntUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Select the option"+"\n"+"1.insert"+"\n"+"2.get all product by price and quantity"+"\n"+"3.get product price"+"\n"+"4.get product on the basis of id"+"\n"+"5.total price"+"\n"+"6.products whose quantity is less than 5");
		
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
			EntityManager em=EntUtil.installEntityMang();
			
			Product p1=new Product("swapnil", 45000, 7);
			
			Product p2=new Product("vhantale", 77000,4);
			Product p3=new Product("ranjit", 75000,3);
			Product p4=new Product("swant", 55000, 2);
			Product p5=new Product("asd", 4000, 5);
			
			
			em.getTransaction().begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.persist(p4);
			em.persist(p5);
			em.getTransaction().commit();
			em.close();
			
			break;
		
		case 2:
			
			EntityManager em1=EntUtil.installEntityMang();
			Query	q=em1.createNamedQuery("product.getpriceAndgetQuantity");
		
			List<Object []> l=q.getResultList();
		
			for(Object[] s:l) {
			
				int p=(int)s[0];
				int qu=(int) s[1];
			
				System.out.println("Price is"+p);
				System.out.println("Qunatity is"+qu);
		}
			em1.close();
			break;
		case 3:
			EntityManager em2=EntUtil.installEntityMang();
			TypedQuery<Integer>	q1=em2.createNamedQuery("product.getprice",Integer.class);
			
			List<Integer> lq=q1.getResultList();
			System.out.println("price");
			lq.forEach(System.out::println);
			
			break;
		case 4:
			System.out.println("Enter the id");
			int n=sc.nextInt();
			
			EntityManager em3=EntUtil.installEntityMang();
			String jpql2="from Product where productId=:id";
			
			TypedQuery<Product> p=em3.createQuery(jpql2,Product.class);
			p.setParameter("id", n);
			Product p9=p.getSingleResult();
			System.out.println(p9);
			em3.close();
			break;
		case 5:
			
			
			EntityManager em4=EntUtil.installEntityMang();
			String jpql3="select sum(price) from Product";
			
			TypedQuery<Long> p7=em4.createQuery(jpql3,Long.class);
			Long s=p7.getSingleResult();
			System.out.println(s);
			em4.close();
			break;
			
		case 6:
			EntityManager em5=EntUtil.installEntityMang();
			String jpql4="from Product where quantity<5";
			
			TypedQuery<Product> p8=em5.createQuery(jpql4,Product.class);
			List<Product> sl=p8.getResultList();
			System.out.println(sl);
			em5.close();
			break;
		}
		
			
		
	}

}
