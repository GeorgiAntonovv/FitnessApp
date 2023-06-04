/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables.daos;


import co.tide.com.fitnessapp.db.jooq.tables.Food;
import co.tide.com.fitnessapp.db.jooq.tables.records.FoodRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.16"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class FoodDao extends DAOImpl<FoodRecord, co.tide.com.fitnessapp.db.jooq.tables.pojos.Food, UUID> {

    /**
     * Create a new FoodDao without any configuration
     */
    public FoodDao() {
        super(Food.FOOD, co.tide.com.fitnessapp.db.jooq.tables.pojos.Food.class);
    }

    /**
     * Create a new FoodDao with an attached configuration
     */
    @Autowired
    public FoodDao(Configuration configuration) {
        super(Food.FOOD, co.tide.com.fitnessapp.db.jooq.tables.pojos.Food.class, configuration);
    }

    @Override
    public UUID getId(co.tide.com.fitnessapp.db.jooq.tables.pojos.Food object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(Food.FOOD.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchById(UUID... values) {
        return fetch(Food.FOOD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public co.tide.com.fitnessapp.db.jooq.tables.pojos.Food fetchOneById(UUID value) {
        return fetchOne(Food.FOOD.ID, value);
    }

    /**
     * Fetch records that have <code>meal_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfMealId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(Food.FOOD.MEAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>meal_id IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByMealId(UUID... values) {
        return fetch(Food.FOOD.MEAL_ID, values);
    }

    /**
     * Fetch records that have <code>food_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfFoodName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Food.FOOD.FOOD_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>food_name IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByFoodName(String... values) {
        return fetch(Food.FOOD.FOOD_NAME, values);
    }

    /**
     * Fetch records that have <code>calories BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfCalories(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Food.FOOD.CALORIES, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>calories IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByCalories(Integer... values) {
        return fetch(Food.FOOD.CALORIES, values);
    }

    /**
     * Fetch records that have <code>protein BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfProtein(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Food.FOOD.PROTEIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>protein IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByProtein(Integer... values) {
        return fetch(Food.FOOD.PROTEIN, values);
    }

    /**
     * Fetch records that have <code>fats BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfFats(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Food.FOOD.FATS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>fats IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByFats(Integer... values) {
        return fetch(Food.FOOD.FATS, values);
    }

    /**
     * Fetch records that have <code>carbs BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfCarbs(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Food.FOOD.CARBS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>carbs IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByCarbs(Integer... values) {
        return fetch(Food.FOOD.CARBS, values);
    }

    /**
     * Fetch records that have <code>created_on BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfCreatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Food.FOOD.CREATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_on IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByCreatedOn(LocalDateTime... values) {
        return fetch(Food.FOOD.CREATED_ON, values);
    }

    /**
     * Fetch records that have <code>updated_on BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchRangeOfUpdatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Food.FOOD.UPDATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_on IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.Food> fetchByUpdatedOn(LocalDateTime... values) {
        return fetch(Food.FOOD.UPDATED_ON, values);
    }
}