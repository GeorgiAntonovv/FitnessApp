/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables;


import co.tide.com.fitnessapp.db.jooq.DefaultSchema;
import co.tide.com.fitnessapp.db.jooq.Keys;
import co.tide.com.fitnessapp.db.jooq.tables.records.MealRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Meal extends TableImpl<MealRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>meal</code>
     */
    public static final Meal MEAL = new Meal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MealRecord> getRecordType() {
        return MealRecord.class;
    }

    /**
     * The column <code>meal.id</code>.
     */
    public final TableField<MealRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>meal.user_id</code>.
     */
    public final TableField<MealRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>meal.name</code>.
     */
    public final TableField<MealRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>meal.created_on</code>.
     */
    public final TableField<MealRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    /**
     * The column <code>meal.updated_on</code>.
     */
    public final TableField<MealRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    private Meal(Name alias, Table<MealRecord> aliased) {
        this(alias, aliased, null);
    }

    private Meal(Name alias, Table<MealRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>meal</code> table reference
     */
    public Meal(String alias) {
        this(DSL.name(alias), MEAL);
    }

    /**
     * Create an aliased <code>meal</code> table reference
     */
    public Meal(Name alias) {
        this(alias, MEAL);
    }

    /**
     * Create a <code>meal</code> table reference
     */
    public Meal() {
        this(DSL.name("meal"), null);
    }

    public <O extends Record> Meal(Table<O> child, ForeignKey<O, MealRecord> key) {
        super(child, key, MEAL);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<MealRecord> getPrimaryKey() {
        return Keys.MEAL_PKEY;
    }

    @Override
    public List<UniqueKey<MealRecord>> getKeys() {
        return Arrays.<UniqueKey<MealRecord>>asList(Keys.MEAL_PKEY);
    }

    @Override
    public List<ForeignKey<MealRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MealRecord, ?>>asList(Keys.MEAL__FK_MEAL_USER);
    }

    private transient User _user;

    public User user() {
        if (_user == null)
            _user = new User(this, Keys.MEAL__FK_MEAL_USER);

        return _user;
    }

    @Override
    public Meal as(String alias) {
        return new Meal(DSL.name(alias), this);
    }

    @Override
    public Meal as(Name alias) {
        return new Meal(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Meal rename(String name) {
        return new Meal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Meal rename(Name name) {
        return new Meal(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, UUID, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
