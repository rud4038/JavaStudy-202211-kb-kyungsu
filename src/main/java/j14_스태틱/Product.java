package j14_스태틱;

import lombok.Data;

/*
    공유영역

 */
@Data
public class Product {
    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }

    public static void print() {
        System.out.println(autoIncrement);
        Product product = new Product("모니터");
        System.out.println(product.getSerialNumber());
        System.out.println(product.add(10, 20));
    }

    public int add(int a, int b) {
        return a + b;
    }
}
