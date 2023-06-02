package com.example.capstoneproject.beans;

import java.util.ArrayList;

public class Review {
        private String title;
        private String description;
        private int rating;

        public Review(String title, String description, int rating) {
            this.title = title;
            this.description = description;
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public int getRating() {
            return rating;
        }
    }


