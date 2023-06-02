package com.example.capstoneproject.dao;

import com.example.capstoneproject.beans.FoodItem;
import com.example.capstoneproject.services.ApplicationService;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDao implements ApplicationService {

    public ApplicationDao() {

    }

    @Override
    public List<FoodItem> search(String keyword) {

        List<FoodItem> result = new ArrayList<>();

        if(keyword==null) return result;

        if(keyword.length()>0){
            result.add(new FoodItem(1,"Fries",5));

            result.add(new FoodItem(2,"Coke",2));
        }


        return result;
    }
}