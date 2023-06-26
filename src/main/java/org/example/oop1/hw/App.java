package org.example.oop1.hw;

public class App {
    public static void main(String[] args) {
        Product teddy = new Product("Мишка", 9.99, 4.5);
        Product barbie = new Product("Кукла", 12.99, 4.8);
        Category toys = new Category("Игрушки", new Product[]{teddy, barbie});
        Category furniture = new Category("Мебель", new Product[]
                {new Product("Кресло", 100, 5.0), new Product("Диван", 555, 3.9)});
        Category clothes = new Category("Одежда", new Product[]
                {new Product("Рубашка", 30, 4.3), new Product("Брюки", 57.99, 4.0)});
        User user1 = new User();
        User user2 = new User();
        // аутентификация пользователя. Пользователь вводит логин-пароль с клавиатуры.
        user1.checkAuthentication(new Login());
        user1.checkAuthentication(new Password());
        user2.checkAuthentication(new Login());
        user2.checkAuthentication(new Password());
        System.out.println("-----------------");
        // просмотр списка товаров определенного каталога
        Category.displayProductsByCategory(toys);
        Category.displayProductsByCategory(furniture);
        System.out.println("-----------------");
        // просмотр списка каталогов товаров
        String[] categories = {toys.getName(), furniture.getName(), clothes.getName()};
        Category.displayCategories(categories);
        System.out.println("-----------------");
        // выбор товара в корзину
        user1.basket.addProductToBasket(teddy);
        user2.basket.addProductToBasket(barbie);
        System.out.println("-----------------");
        //покупка товаров, находящихся в корзине.
        user1.basket.buyProductFromBasket(teddy);
        user2.basket.buyProductFromBasket(teddy);
    }
}

/**
 * Enter Login please
 * user1
 *
 * Login is correct
 * Enter Password please
 * pass1word
 *
 * Password is correct
 *
 * Enter Login please
 * 3
 * your Login is not correct, we cannot find you in our system
 * Enter Password please
 * d
 * your Password is not correct, we cannot find you in our system
 * -----------------
 * Category: Игрушки
 * Мишка, price: 9.99, ranking: 4.5
 * Кукла, price: 12.99, ranking: 4.8
 * Category: Мебель
 * Кресло, price: 100.0, ranking: 5.0
 * Диван, price: 555.0, ranking: 3.9
 * -----------------
 * Available categories:
 * Игрушки
 * Мебель
 * Одежда
 * -----------------
 * Мишка был добавлен в корзину
 * Кукла был добавлен в корзину
 * -----------------
 * Спасибо за ваш заказ нашего товара - Мишка
 * К сожалению, нужный вам товар не найден, добавьте другой товар на ваш выбор в корзину
 *
 * Process finished with exit code 0
 */