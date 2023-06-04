/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables.records;


import co.tide.com.fitnessapp.db.jooq.tables.Food;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FoodRecord extends UpdatableRecordImpl<FoodRecord> implements Record9<UUID, UUID, String, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>food.id</code>.
     */
    public FoodRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>food.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>food.meal_id</code>.
     */
    public FoodRecord setMealId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>food.meal_id</code>.
     */
    public UUID getMealId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>food.food_name</code>.
     */
    public FoodRecord setFoodName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>food.food_name</code>.
     */
    public String getFoodName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>food.calories</code>.
     */
    public FoodRecord setCalories(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>food.calories</code>.
     */
    public Integer getCalories() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>food.protein</code>.
     */
    public FoodRecord setProtein(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>food.protein</code>.
     */
    public Integer getProtein() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>food.fats</code>.
     */
    public FoodRecord setFats(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>food.fats</code>.
     */
    public Integer getFats() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>food.carbs</code>.
     */
    public FoodRecord setCarbs(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>food.carbs</code>.
     */
    public Integer getCarbs() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>food.created_on</code>.
     */
    public FoodRecord setCreatedOn(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>food.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>food.updated_on</code>.
     */
    public FoodRecord setUpdatedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>food.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, UUID, String, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UUID, UUID, String, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Food.FOOD.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Food.FOOD.MEAL_ID;
    }

    @Override
    public Field<String> field3() {
        return Food.FOOD.FOOD_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return Food.FOOD.CALORIES;
    }

    @Override
    public Field<Integer> field5() {
        return Food.FOOD.PROTEIN;
    }

    @Override
    public Field<Integer> field6() {
        return Food.FOOD.FATS;
    }

    @Override
    public Field<Integer> field7() {
        return Food.FOOD.CARBS;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Food.FOOD.CREATED_ON;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Food.FOOD.UPDATED_ON;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getMealId();
    }

    @Override
    public String component3() {
        return getFoodName();
    }

    @Override
    public Integer component4() {
        return getCalories();
    }

    @Override
    public Integer component5() {
        return getProtein();
    }

    @Override
    public Integer component6() {
        return getFats();
    }

    @Override
    public Integer component7() {
        return getCarbs();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdatedOn();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getMealId();
    }

    @Override
    public String value3() {
        return getFoodName();
    }

    @Override
    public Integer value4() {
        return getCalories();
    }

    @Override
    public Integer value5() {
        return getProtein();
    }

    @Override
    public Integer value6() {
        return getFats();
    }

    @Override
    public Integer value7() {
        return getCarbs();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdatedOn();
    }

    @Override
    public FoodRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public FoodRecord value2(UUID value) {
        setMealId(value);
        return this;
    }

    @Override
    public FoodRecord value3(String value) {
        setFoodName(value);
        return this;
    }

    @Override
    public FoodRecord value4(Integer value) {
        setCalories(value);
        return this;
    }

    @Override
    public FoodRecord value5(Integer value) {
        setProtein(value);
        return this;
    }

    @Override
    public FoodRecord value6(Integer value) {
        setFats(value);
        return this;
    }

    @Override
    public FoodRecord value7(Integer value) {
        setCarbs(value);
        return this;
    }

    @Override
    public FoodRecord value8(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public FoodRecord value9(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public FoodRecord values(UUID value1, UUID value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FoodRecord
     */
    public FoodRecord() {
        super(Food.FOOD);
    }

    /**
     * Create a detached, initialised FoodRecord
     */
    @ConstructorProperties({ "id", "mealId", "foodName", "calories", "protein", "fats", "carbs", "createdOn", "updatedOn" })
    public FoodRecord(UUID id, UUID mealId, String foodName, Integer calories, Integer protein, Integer fats, Integer carbs, LocalDateTime createdOn, LocalDateTime updatedOn) {
        super(Food.FOOD);

        setId(id);
        setMealId(mealId);
        setFoodName(foodName);
        setCalories(calories);
        setProtein(protein);
        setFats(fats);
        setCarbs(carbs);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }
}