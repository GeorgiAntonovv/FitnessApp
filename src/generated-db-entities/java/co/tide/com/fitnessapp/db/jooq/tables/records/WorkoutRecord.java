/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables.records;


import co.tide.com.fitnessapp.db.jooq.tables.Workout;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class WorkoutRecord extends UpdatableRecordImpl<WorkoutRecord> implements Record4<UUID, UUID, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>workout.id</code>.
     */
    public WorkoutRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>workout.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>workout.user_id</code>.
     */
    public WorkoutRecord setUserId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>workout.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>workout.created_on</code>.
     */
    public WorkoutRecord setCreatedOn(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>workout.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>workout.updated_on</code>.
     */
    public WorkoutRecord setUpdatedOn(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>workout.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<UUID, UUID, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UUID, UUID, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Workout.WORKOUT.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Workout.WORKOUT.USER_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Workout.WORKOUT.CREATED_ON;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Workout.WORKOUT.UPDATED_ON;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getUserId();
    }

    @Override
    public LocalDateTime component3() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime component4() {
        return getUpdatedOn();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getUserId();
    }

    @Override
    public LocalDateTime value3() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime value4() {
        return getUpdatedOn();
    }

    @Override
    public WorkoutRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public WorkoutRecord value2(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public WorkoutRecord value3(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public WorkoutRecord value4(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public WorkoutRecord values(UUID value1, UUID value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkoutRecord
     */
    public WorkoutRecord() {
        super(Workout.WORKOUT);
    }

    /**
     * Create a detached, initialised WorkoutRecord
     */
    @ConstructorProperties({ "id", "userId", "createdOn", "updatedOn" })
    public WorkoutRecord(UUID id, UUID userId, LocalDateTime createdOn, LocalDateTime updatedOn) {
        super(Workout.WORKOUT);

        setId(id);
        setUserId(userId);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }
}