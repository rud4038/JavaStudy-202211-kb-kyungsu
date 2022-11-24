package j14_스태틱;

import j07_메소드.Method1;

import java.lang.reflect.Method;

public class ProductMain {

    public void show() {
        System.out.println("메인메소드에서 호출");
    }

    public static void main(String[] args) {
        Product product1 = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");

        System.out.println(product1);
        System.out.println(product2);

        product1.print();
        product2.print();
        Product.print();

        ProductMain pm = new ProductMain();
        pm.show();

        Method1.main(null);
        Method1.method1();

    }
}
