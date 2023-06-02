package com.example.capstoneproject.beans;

import java.util.ArrayList;

public class Product {
    private String name;
    private ArrayList<Review> reviews;

    public Product(String name) {
        this.name = name;
        this.reviews = new ArrayList<Review>();
    }

    public String getName() {
        return name;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public double getAverageRating() {
        if (this.reviews.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Review review : this.reviews) {
            sum += review.getRating();
        }

        return (double) sum / this.reviews.size();
    }

    public void printReviews() {
        System.out.println("review " + this.name + ":");
        for (Review review : this.reviews) {
            System.out.println("- " + review.getTitle() + " (" + review.getRating() + " stars)");
            System.out.println(review.getDescription());
            System.out.println();
        }
    }
}
