package com.FitnessApp.meal.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Meal;
import com.FitnessApp.meal.model.CreateMeal;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.tide.com.fitnessapp.db.jooq.tables.Meal.MEAL;

@Repository
@RequiredArgsConstructor
public class MealRepository {

    private final DSLContext dslContext;
    private final Clock clock;

    public UUID insert(CreateMeal meal) {

        UUID id = UUID.randomUUID();
        dslContext.insertInto(MEAL)
                .set(MEAL.ID, id)
                .set(MEAL.USER_ID, meal.getUserId())
                .set(MEAL.CREATED_ON, LocalDateTime.now(clock))
                .set(MEAL.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return id;
    }

    public Optional<Meal> findByUserId(UUID userId) {

        return dslContext.selectFrom(MEAL)
                .where(MEAL.USER_ID.eq(userId))
                .fetchOptionalInto(Meal.class);
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(MEAL)
                .where(MEAL.ID.eq(id))
                .execute();
    }
}

