package org.example.oop1.hw;

public class Basket {
    private final Product[] products;
    private int size = 0;

    public Basket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProductToBasket(Product product) {
        if (size < products.length) {
            products[size] = product;
            size++;
            System.out.println(product.getName() + " был добавлен в корзину");
            return true;
        } else {
            System.out.println(product.getName() + " нельзя добавить в корзину");
            return false;
        }
    }

    public void buyProductFromBasket(Product product) {
        for (int i = 0; i < size; i++) {
            if (products[i].equals(product)) {
                products[i] = products[size - 1];
                size--;
                System.out.println("Спасибо за ваш заказ нашего товара - "
                        + product.getName());
                break;
            } else {
                System.out.println("К сожалению, нужный вам товар не найден, добавьте другой товар "
                        + "на ваш выбор в корзину");
            }
        }
    }
}
