package com.FitnessApp.exercise.service;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Exercise;
import com.FitnessApp.exercise.model.CreateExercise;
import com.FitnessApp.exercise.model.UpdateExercise;
import com.FitnessApp.exercise.repository.ExerciseRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public UUID createExercise(CreateExercise exercise) {
        return exerciseRepository.insert(exercise);
    }

    public List<Exercise> findAllExercisesByWorkoutId(UUID workoutId) {
        return exerciseRepository.findByAllWorkoutId(workoutId);
    }

    public boolean updateExercise(UUID id, UpdateExercise exercise) {
        return exerciseRepository.updateExercise(id, exercise);
    }

    public void deleteExercise(UUID id) {
        exerciseRepository.deleteById(id);
    }

    public Exercise getExerciseById(UUID id) {

        Optional<Exercise> exercise = exerciseRepository.findExerciseById(id);
        return exercise.orElse(null);
    }
}

