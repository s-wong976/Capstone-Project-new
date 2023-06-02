package com.example.capstoneproject.beans;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("product name");

        Review review1 = new Review("positive review headline", "revoiew description", 5);
        Review review2 = new Review("for ex. sake negative review headline", "negative review description", 2);

        product.addReview(review1);
        product.addReview(review2);

        double averageRating = product.getAverageRating();
        System.out.println("average rating for " + product.getName() + ": " + averageRating + " stars");

        product.printReviews();
    }
}
