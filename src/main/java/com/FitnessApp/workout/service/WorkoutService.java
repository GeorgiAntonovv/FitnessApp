package com.FitnessApp.workout.service;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Workout;
import com.FitnessApp.exercise.repository.ExerciseRepository;
import com.FitnessApp.workout.model.CreateWorkout;
import com.FitnessApp.workout.repository.WorkoutRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WorkoutService {

    private final WorkoutRepository workoutRepository;
    private final ExerciseRepository exerciseRepository;

    public UUID createWorkout(CreateWorkout workout) {
        return workoutRepository.insert(workout);
    }

    public List<Workout> findAllWorkoutsByUserId(UUID userId) {
        return workoutRepository.findByAllUserId(userId);
    }

    public void deleteWorkout(UUID id) {
        exerciseRepository.deleteAllByWorkoutId(id);
        workoutRepository.deleteById(id);
    }
}

