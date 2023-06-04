package com.FitnessApp.user.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.User;
import com.FitnessApp.user.model.CreateUser;
import com.FitnessApp.user.model.UpdateUser;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
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
                .set(USER.CREATED_ON, LocalDateTime.now(clock))
                .set(USER.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return id;
    }

    public Optional<User> findByUsernameAndPassword(String username, String password) {

        return dslContext.selectFrom(USER)
                .where(USER.USERNAME.eq(username))
                .and(USER.PASSWORD.eq(password))
                .fetchOptionalInto(User.class);
    }

    public void updateUser(UUID id, UpdateUser user) {

        dslContext.update(USER)
                .set(USER.USERNAME, user.getUsername())
                .set(USER.PASSWORD, user.getPassword())
                .set(USER.FIRST_NAME, user.getFirstName())
                .set(USER.LAST_NAME, user.getLastName())
                .set(USER.EMAIL, user.getEmail())
                .set(USER.UPDATED_ON, LocalDateTime.now(clock))
                .where(USER.ID.eq(id))
                .execute();
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(USER)
                .where(USER.ID.eq(id))
                .execute();
    }
}

