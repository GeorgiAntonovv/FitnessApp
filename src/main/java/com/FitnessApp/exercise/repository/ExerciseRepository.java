package com.FitnessApp.exercise.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Exercise;
import com.FitnessApp.exercise.model.CreateExercise;
import com.FitnessApp.exercise.model.UpdateExercise;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.tide.com.fitnessapp.db.jooq.tables.Exercise.EXERCISE;

@Repository
@RequiredArgsConstructor
public class ExerciseRepository {

    private final DSLContext dslContext;
    private final Clock clock;

    public UUID insert(CreateExercise exercise) {

        UUID id = UUID.randomUUID();
        dslContext.insertInto(EXERCISE)
                .set(EXERCISE.ID, id)
                .set(EXERCISE.WORKOUT_ID, exercise.getWorkoutId())
                .set(EXERCISE.EXERCISE_NAME, exercise.getExerciseName())
                .set(EXERCISE.SETS, exercise.getSets())
                .set(EXERCISE.REPS, exercise.getReps())
                .set(EXERCISE.NOTES, exercise.getNotes())
                .set(EXERCISE.CREATED_ON, LocalDateTime.now(clock))
                .set(EXERCISE.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return id;
    }

    public Optional<Exercise> findByWorkoutId(UUID workoutId) {

        return dslContext.selectFrom(EXERCISE)
                .where(EXERCISE.WORKOUT_ID.eq(workoutId))
                .fetchOptionalInto(Exercise.class);
    }

    public void updateExercise(UUID id, UpdateExercise exercise) {

        dslContext.update(EXERCISE)
                .set(EXERCISE.WORKOUT_ID, exercise.getWorkoutId())
                .set(EXERCISE.EXERCISE_NAME, exercise.getExerciseName())
                .set(EXERCISE.SETS, exercise.getSets())
                .set(EXERCISE.REPS, exercise.getReps())
                .set(EXERCISE.NOTES, exercise.getNotes())
                .set(EXERCISE.UPDATED_ON, LocalDateTime.now(clock))
                .where(EXERCISE.ID.eq(id))
                .execute();
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(EXERCISE)
                .where(EXERCISE.ID.eq(id))
                .execute();
    }
}

