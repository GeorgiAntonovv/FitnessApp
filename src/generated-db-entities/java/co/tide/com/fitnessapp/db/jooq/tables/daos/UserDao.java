/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables.daos;


import co.tide.com.fitnessapp.db.jooq.tables.User;
import co.tide.com.fitnessapp.db.jooq.tables.records.UserRecord;

import java.math.BigDecimal;
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
public class UserDao extends DAOImpl<UserRecord, co.tide.com.fitnessapp.db.jooq.tables.pojos.User, UUID> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, co.tide.com.fitnessapp.db.jooq.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    @Autowired
    public UserDao(Configuration configuration) {
        super(User.USER, co.tide.com.fitnessapp.db.jooq.tables.pojos.User.class, configuration);
    }

    @Override
    public UUID getId(co.tide.com.fitnessapp.db.jooq.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(User.USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchById(UUID... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public co.tide.com.fitnessapp.db.jooq.tables.pojos.User fetchOneById(UUID value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>username BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfUsername(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.USERNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByUsername(String... values) {
        return fetch(User.USER.USERNAME, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByFirstName(String... values) {
        return fetch(User.USER.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByLastName(String... values) {
        return fetch(User.USER.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByEmail(String... values) {
        return fetch(User.USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>role BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfRole(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.ROLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>role IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByRole(String... values) {
        return fetch(User.USER.ROLE, values);
    }

    /**
     * Fetch records that have <code>current_weight BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfCurrentWeight(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.CURRENT_WEIGHT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>current_weight IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByCurrentWeight(Integer... values) {
        return fetch(User.USER.CURRENT_WEIGHT, values);
    }

    /**
     * Fetch records that have <code>goal_weight BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfGoalWeight(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.GOAL_WEIGHT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>goal_weight IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByGoalWeight(Integer... values) {
        return fetch(User.USER.GOAL_WEIGHT, values);
    }

    /**
     * Fetch records that have <code>body_fat BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfBodyFat(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(User.USER.BODY_FAT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>body_fat IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByBodyFat(BigDecimal... values) {
        return fetch(User.USER.BODY_FAT, values);
    }

    /**
     * Fetch records that have <code>goal_body_fat BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfGoalBodyFat(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(User.USER.GOAL_BODY_FAT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>goal_body_fat IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByGoalBodyFat(BigDecimal... values) {
        return fetch(User.USER.GOAL_BODY_FAT, values);
    }

    /**
     * Fetch records that have <code>created_on BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfCreatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(User.USER.CREATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_on IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByCreatedOn(LocalDateTime... values) {
        return fetch(User.USER.CREATED_ON, values);
    }

    /**
     * Fetch records that have <code>updated_on BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchRangeOfUpdatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(User.USER.UPDATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_on IN (values)</code>
     */
    public List<co.tide.com.fitnessapp.db.jooq.tables.pojos.User> fetchByUpdatedOn(LocalDateTime... values) {
        return fetch(User.USER.UPDATED_ON, values);
    }
}
