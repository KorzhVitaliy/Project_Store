package views;

import models.Purchase;
import utils.Exceptions;

import java.util.Scanner;

public class PurchaseView {

    Purchase model;
    String title;
    String userName;
    int quantity;
    double price;
    Scanner scanner;

    public PurchaseView(Purchase model) {
        this.model = model;
    }

    public void getInputs() {
        scanner = new Scanner(System.in);
        title = "Please, type your name: ";
        System.out.println(title);
        userName = Exceptions.validateName(scanner);
        model.setClientName(userName);

        title = "Please, type the quantity of items (pieces): ";
        System.out.println(title);
        quantity = Exceptions.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Please, type the price for item (USD): ";
        System.out.println(title);
        price = Exceptions.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
