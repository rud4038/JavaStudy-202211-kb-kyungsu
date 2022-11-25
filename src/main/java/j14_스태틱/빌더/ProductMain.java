package j14_스태틱.빌더;

public class ProductMain {

    public static void main(String[] args) {
        Product product = Product.builder()
                .productCode(2022)
                .productName("dd")
                .price(2)
                .stock(1)
                .build();
        Product productBuilder = Product.builder()
                .productCode(200)
                .productName("dasd")
                .price(1)
                .stock(1)
                .build();
        System.out.println(product);
        System.out.println(productBuilder);

    }
}
