/*
 * This file is generated by jOOQ.
 */
package co.tide.com.fitnessapp.db.jooq.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.processing.Generated;


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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID          id;
    private String        username;
    private String        password;
    private String        firstName;
    private String        lastName;
    private String        email;
    private String        role;
    private Integer       currentWeight;
    private Integer       goalWeight;
    private BigDecimal    bodyFat;
    private BigDecimal    goalBodyFat;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.username = value.username;
        this.password = value.password;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.email = value.email;
        this.role = value.role;
        this.currentWeight = value.currentWeight;
        this.goalWeight = value.goalWeight;
        this.bodyFat = value.bodyFat;
        this.goalBodyFat = value.goalBodyFat;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    @ConstructorProperties({ "id", "username", "password", "firstName", "lastName", "email", "role", "currentWeight", "goalWeight", "bodyFat", "goalBodyFat", "createdOn", "updatedOn" })
    public User(
        UUID          id,
        String        username,
        String        password,
        String        firstName,
        String        lastName,
        String        email,
        String        role,
        Integer       currentWeight,
        Integer       goalWeight,
        BigDecimal    bodyFat,
        BigDecimal    goalBodyFat,
        LocalDateTime createdOn,
        LocalDateTime updatedOn
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.currentWeight = currentWeight;
        this.goalWeight = goalWeight;
        this.bodyFat = bodyFat;
        this.goalBodyFat = goalBodyFat;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for <code>user.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>user.id</code>.
     */
    public User setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>user.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>user.username</code>.
     */
    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Getter for <code>user.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>user.password</code>.
     */
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>user.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>user.first_name</code>.
     */
    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Getter for <code>user.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>user.last_name</code>.
     */
    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Getter for <code>user.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>user.email</code>.
     */
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>user.role</code>.
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Setter for <code>user.role</code>.
     */
    public User setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Getter for <code>user.current_weight</code>.
     */
    public Integer getCurrentWeight() {
        return this.currentWeight;
    }

    /**
     * Setter for <code>user.current_weight</code>.
     */
    public User setCurrentWeight(Integer currentWeight) {
        this.currentWeight = currentWeight;
        return this;
    }

    /**
     * Getter for <code>user.goal_weight</code>.
     */
    public Integer getGoalWeight() {
        return this.goalWeight;
    }

    /**
     * Setter for <code>user.goal_weight</code>.
     */
    public User setGoalWeight(Integer goalWeight) {
        this.goalWeight = goalWeight;
        return this;
    }

    /**
     * Getter for <code>user.body_fat</code>.
     */
    public BigDecimal getBodyFat() {
        return this.bodyFat;
    }

    /**
     * Setter for <code>user.body_fat</code>.
     */
    public User setBodyFat(BigDecimal bodyFat) {
        this.bodyFat = bodyFat;
        return this;
    }

    /**
     * Getter for <code>user.goal_body_fat</code>.
     */
    public BigDecimal getGoalBodyFat() {
        return this.goalBodyFat;
    }

    /**
     * Setter for <code>user.goal_body_fat</code>.
     */
    public User setGoalBodyFat(BigDecimal goalBodyFat) {
        this.goalBodyFat = goalBodyFat;
        return this;
    }

    /**
     * Getter for <code>user.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>user.created_on</code>.
     */
    public User setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>user.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>user.updated_on</code>.
     */
    public User setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        }
        else if (!username.equals(other.username))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        }
        else if (!password.equals(other.password))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        }
        else if (!role.equals(other.role))
            return false;
        if (currentWeight == null) {
            if (other.currentWeight != null)
                return false;
        }
        else if (!currentWeight.equals(other.currentWeight))
            return false;
        if (goalWeight == null) {
            if (other.goalWeight != null)
                return false;
        }
        else if (!goalWeight.equals(other.goalWeight))
            return false;
        if (bodyFat == null) {
            if (other.bodyFat != null)
                return false;
        }
        else if (!bodyFat.equals(other.bodyFat))
            return false;
        if (goalBodyFat == null) {
            if (other.goalBodyFat != null)
                return false;
        }
        else if (!goalBodyFat.equals(other.goalBodyFat))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (updatedOn == null) {
            if (other.updatedOn != null)
                return false;
        }
        else if (!updatedOn.equals(other.updatedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.username == null) ? 0 : this.username.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.role == null) ? 0 : this.role.hashCode());
        result = prime * result + ((this.currentWeight == null) ? 0 : this.currentWeight.hashCode());
        result = prime * result + ((this.goalWeight == null) ? 0 : this.goalWeight.hashCode());
        result = prime * result + ((this.bodyFat == null) ? 0 : this.bodyFat.hashCode());
        result = prime * result + ((this.goalBodyFat == null) ? 0 : this.goalBodyFat.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.updatedOn == null) ? 0 : this.updatedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(email);
        sb.append(", ").append(role);
        sb.append(", ").append(currentWeight);
        sb.append(", ").append(goalWeight);
        sb.append(", ").append(bodyFat);
        sb.append(", ").append(goalBodyFat);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
