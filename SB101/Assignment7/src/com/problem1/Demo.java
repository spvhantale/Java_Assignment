package com.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> product=new ArrayList<>();
		product.add(new Product(1,"swapnil", 460, 12));
		product.add(new Product(5,"vhantale", 250, 12));
		product.add(new Product(4,"ranjit", 450, 2));
		product.add(new Product(2,"sawant", 1050, 22));
		product.add(new Product(7,"kunal", 950, 1));
//		System.out.println(product);
		System.out.println("Without sorting and filtering");
		product.forEach(s->System.out.println(s));
		System.out.println("================================");
		System.out.println("With sorting and Filter");
		Stream<Product> ps=product.stream();
//		Stream<Product> prod=ps.filter(s->s.getQuantity()>10 ? true:false);
//		List<Product> products=prod.collect(Collectors.toList());
//		System.out.println(product);
//		Collections.sort(products,(p1,p2)->{
//			return p1.getPrice()>p2.getPrice() ? +1:-1;
//		});
//		products.forEach(s->System.out.println(s));
//		System.out.println(products);
	List<Product>products=ps.filter(s->s.getQuantity()>10 ? true:false).collect(Collectors.toList());
			Collections.sort(products,(p1,p2)->p1.getPrice()>p2.getPrice() ? +1:-1);
	products.forEach(s->System.out.println(s));
	}
	

}
