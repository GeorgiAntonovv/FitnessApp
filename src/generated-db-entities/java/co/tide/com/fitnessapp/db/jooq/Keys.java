/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq;


import co.tide.com.fitnessapp.db.jooq.tables.Exercise;
import co.tide.com.fitnessapp.db.jooq.tables.Food;
import co.tide.com.fitnessapp.db.jooq.tables.Goal;
import co.tide.com.fitnessapp.db.jooq.tables.Meal;
import co.tide.com.fitnessapp.db.jooq.tables.User;
import co.tide.com.fitnessapp.db.jooq.tables.Workout;
import co.tide.com.fitnessapp.db.jooq.tables.records.ExerciseRecord;
import co.tide.com.fitnessapp.db.jooq.tables.records.FoodRecord;
import co.tide.com.fitnessapp.db.jooq.tables.records.GoalRecord;
import co.tide.com.fitnessapp.db.jooq.tables.records.MealRecord;
import co.tide.com.fitnessapp.db.jooq.tables.records.UserRecord;
import co.tide.com.fitnessapp.db.jooq.tables.records.WorkoutRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * the default schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.16"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ExerciseRecord> EXERCISE_PKEY = Internal.createUniqueKey(Exercise.EXERCISE, DSL.name("exercise_pkey"), new TableField[] { Exercise.EXERCISE.ID }, true);
    public static final UniqueKey<FoodRecord> FOOD_PKEY = Internal.createUniqueKey(Food.FOOD, DSL.name("food_pkey"), new TableField[] { Food.FOOD.ID }, true);
    public static final UniqueKey<GoalRecord> GOAL_PKEY = Internal.createUniqueKey(Goal.GOAL, DSL.name("goal_pkey"), new TableField[] { Goal.GOAL.ID }, true);
    public static final UniqueKey<MealRecord> MEAL_PKEY = Internal.createUniqueKey(Meal.MEAL, DSL.name("meal_pkey"), new TableField[] { Meal.MEAL.ID }, true);
    public static final UniqueKey<UserRecord> USER_PKEY = Internal.createUniqueKey(User.USER, DSL.name("user_pkey"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<WorkoutRecord> WORKOUT_PKEY = Internal.createUniqueKey(Workout.WORKOUT, DSL.name("workout_pkey"), new TableField[] { Workout.WORKOUT.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ExerciseRecord, WorkoutRecord> EXERCISE__FK_EXERCISE_WORKOUT = Internal.createForeignKey(Exercise.EXERCISE, DSL.name("fk_exercise_workout"), new TableField[] { Exercise.EXERCISE.WORKOUT_ID }, Keys.WORKOUT_PKEY, new TableField[] { Workout.WORKOUT.ID }, true);
    public static final ForeignKey<FoodRecord, MealRecord> FOOD__FK_FOOD_MEAL = Internal.createForeignKey(Food.FOOD, DSL.name("fk_food_meal"), new TableField[] { Food.FOOD.MEAL_ID }, Keys.MEAL_PKEY, new TableField[] { Meal.MEAL.ID }, true);
    public static final ForeignKey<GoalRecord, UserRecord> GOAL__FK_GOAL_USER = Internal.createForeignKey(Goal.GOAL, DSL.name("fk_goal_user"), new TableField[] { Goal.GOAL.USER_ID }, Keys.USER_PKEY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<MealRecord, UserRecord> MEAL__FK_MEAL_USER = Internal.createForeignKey(Meal.MEAL, DSL.name("fk_meal_user"), new TableField[] { Meal.MEAL.USER_ID }, Keys.USER_PKEY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<WorkoutRecord, UserRecord> WORKOUT__FK_WORKOUT_USER = Internal.createForeignKey(Workout.WORKOUT, DSL.name("fk_workout_user"), new TableField[] { Workout.WORKOUT.USER_ID }, Keys.USER_PKEY, new TableField[] { User.USER.ID }, true);
}
