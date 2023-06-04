package com.FitnessApp.workout.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Workout;
import com.FitnessApp.workout.model.CreateWorkout;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.tide.com.fitnessapp.db.jooq.tables.Workout.WORKOUT;

@Repository
@RequiredArgsConstructor
public class WorkoutRepository {

    private final DSLContext dslContext;
    private final Clock clock;

    public UUID insert(CreateWorkout workout) {

        UUID workoutId = UUID.randomUUID();
        dslContext.insertInto(WORKOUT)
                .set(WORKOUT.ID, workoutId)
                .set(WORKOUT.USER_ID, workout.getUserId())
                .set(WORKOUT.CREATED_ON, LocalDateTime.now(clock))
                .set(WORKOUT.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return workoutId;
    }

    public Optional<Workout> findByUserId(UUID userId) {

        return dslContext.selectFrom(WORKOUT)
                .where(WORKOUT.USER_ID.eq(userId))
                .fetchOptionalInto(Workout.class);
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(WORKOUT)
                .where(WORKOUT.ID.eq(id))
                .execute();
    }
}
