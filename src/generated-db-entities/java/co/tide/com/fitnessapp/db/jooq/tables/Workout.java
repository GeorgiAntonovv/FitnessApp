/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables;


import co.tide.com.fitnessapp.db.jooq.DefaultSchema;
import co.tide.com.fitnessapp.db.jooq.Keys;
import co.tide.com.fitnessapp.db.jooq.tables.records.WorkoutRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class Workout extends TableImpl<WorkoutRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>workout</code>
     */
    public static final Workout WORKOUT = new Workout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WorkoutRecord> getRecordType() {
        return WorkoutRecord.class;
    }

    /**
     * The column <code>workout.id</code>.
     */
    public final TableField<WorkoutRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>workout.user_id</code>.
     */
    public final TableField<WorkoutRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>workout.created_on</code>.
     */
    public final TableField<WorkoutRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    /**
     * The column <code>workout.updated_on</code>.
     */
    public final TableField<WorkoutRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    private Workout(Name alias, Table<WorkoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private Workout(Name alias, Table<WorkoutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>workout</code> table reference
     */
    public Workout(String alias) {
        this(DSL.name(alias), WORKOUT);
    }

    /**
     * Create an aliased <code>workout</code> table reference
     */
    public Workout(Name alias) {
        this(alias, WORKOUT);
    }

    /**
     * Create a <code>workout</code> table reference
     */
    public Workout() {
        this(DSL.name("workout"), null);
    }

    public <O extends Record> Workout(Table<O> child, ForeignKey<O, WorkoutRecord> key) {
        super(child, key, WORKOUT);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<WorkoutRecord> getPrimaryKey() {
        return Keys.WORKOUT_PKEY;
    }

    @Override
    public List<UniqueKey<WorkoutRecord>> getKeys() {
        return Arrays.<UniqueKey<WorkoutRecord>>asList(Keys.WORKOUT_PKEY);
    }

    @Override
    public List<ForeignKey<WorkoutRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WorkoutRecord, ?>>asList(Keys.WORKOUT__FK_WORKOUT_USER);
    }

    private transient User _user;

    public User user() {
        if (_user == null)
            _user = new User(this, Keys.WORKOUT__FK_WORKOUT_USER);

        return _user;
    }

    @Override
    public Workout as(String alias) {
        return new Workout(DSL.name(alias), this);
    }

    @Override
    public Workout as(Name alias) {
        return new Workout(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Workout rename(String name) {
        return new Workout(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Workout rename(Name name) {
        return new Workout(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<UUID, UUID, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}