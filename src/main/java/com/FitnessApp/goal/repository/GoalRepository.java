package com.FitnessApp.goal.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Goal;
import com.FitnessApp.goal.model.CreateGoal;
import com.FitnessApp.goal.model.UpdateGoal;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.tide.com.fitnessapp.db.jooq.tables.Goal.GOAL;

@Repository
@RequiredArgsConstructor
public class GoalRepository {

    private final DSLContext dslContext;
    private final Clock clock;

    public UUID insert(CreateGoal goal) {

        UUID id = UUID.randomUUID();
        dslContext.insertInto(GOAL)
                .set(GOAL.ID, id)
                .set(GOAL.USER_ID, goal.getUserId())
                .set(GOAL.CURRENT_WEIGHT, goal.getCurrentWeight())
                .set(GOAL.GOAL_WEIGHT, goal.getGoalWeight())
                .set(GOAL.PROGRESS_STATUS, goal.getProgressStatus())
                .set(GOAL.CREATED_ON, LocalDateTime.now(clock))
                .set(GOAL.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return id;
    }

    public Optional<Goal> findByUserId(UUID userId) {

        return dslContext.selectFrom(GOAL)
                .where(GOAL.USER_ID.eq(userId))
                .fetchOptionalInto(Goal.class);
    }

    public void updateGoal(UUID id, UpdateGoal goal) {

        dslContext.update(GOAL)
                .set(GOAL.USER_ID, goal.getUserId())
                .set(GOAL.CURRENT_WEIGHT, goal.getCurrentWeight())
                .set(GOAL.GOAL_WEIGHT, goal.getGoalWeight())
                .set(GOAL.PROGRESS_STATUS, goal.getProgressStatus())
                .set(GOAL.UPDATED_ON, LocalDateTime.now(clock))
                .where(GOAL.ID.eq(id))
                .execute();
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(GOAL)
                .where(GOAL.ID.eq(id))
                .execute();
    }
}

