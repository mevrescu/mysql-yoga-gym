package com.yoga.gym.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by cimbonda on 11/5/2017.
 */
@Entity
public class Workout {

    private WorkoutType workoutType;

    private Instructor instructor;

    private Date date;

    @ManyToMany(mappedBy = "workouts")
    private List<User> users;

}
