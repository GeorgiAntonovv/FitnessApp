package com.FitnessApp.user.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.User;
import co.tide.com.fitnessapp.db.jooq.tables.records.UserRecord;
import com.FitnessApp.user.model.CreateUser;
import com.FitnessApp.user.model.UpdateProfile;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.UpdateSetMoreStep;
import org.springframework.stereotype.Repository;

import static co.tide.com.fitnessapp.db.jooq.tables.User.USER;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final DSLContext dslContext;
    private final Clock clock;

    public UUID insert(CreateUser user) {

        UUID id = UUID.randomUUID();
        dslContext.insertInto(USER)
                .set(USER.ID, id)
                .set(USER.USERNAME, user.getUsername())
                .set(USER.PASSWORD, user.getPassword())
                .set(USER.FIRST_NAME, user.getFirstName())
                .set(USER.LAST_NAME, user.getLastName())
                .set(USER.EMAIL, user.getEmail())
                .set(USER.ROLE, user.getRole())
                .set(USER.CREATED_ON, LocalDateTime.now(clock))
                .set(USER.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return id;
    }

    public Optional<User> findByUserId(UUID userId) {

        return dslContext.selectFrom(USER)
                .where(USER.ID.eq(userId))
                .fetchOptionalInto(User.class);
    }

    public Optional<User> findByUsernameAndPassword(String username, String password) {

        return dslContext.selectFrom(USER)
                .where(USER.USERNAME.eq(username))
                .and(USER.PASSWORD.eq(password))
                .fetchOptionalInto(User.class);
    }

    public void updateProfile(UUID id, UpdateProfile user) {

        UpdateSetMoreStep<UserRecord> updateStep = dslContext.update(USER)
                .set(USER.UPDATED_ON, LocalDateTime.now(clock));
        if (user.getFirstName() != null) {
            updateStep.set(USER.FIRST_NAME, user.getFirstName());
        }
        if (user.getLastName() != null) {
            updateStep.set(USER.LAST_NAME, user.getLastName());
        }
        if (user.getEmail() != null) {
            updateStep.set(USER.EMAIL, user.getEmail());
        }
        if (user.getCurrentWeight() != null) {
            updateStep.set(USER.CURRENT_WEIGHT, user.getCurrentWeight());
        }
        if (user.getGoalWeight() != null) {
            updateStep.set(USER.GOAL_WEIGHT, user.getGoalWeight());
        }
        if (user.getBodyFat() != null) {
            updateStep.set(USER.BODY_FAT, user.getBodyFat());
        }
        if (user.getGoalBodyFat() != null) {
            updateStep.set(USER.GOAL_BODY_FAT, user.getGoalBodyFat());
        }
        updateStep.where(USER.ID.eq(id)).execute();
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(USER)
                .where(USER.ID.eq(id))
                .execute();
    }
}

