package com.example.capstoneproject.services;

import com.example.capstoneproject.beans.FoodItem;

import java.util.List;

public interface ApplicationService {

    public List<FoodItem> search(String keyword);
}
