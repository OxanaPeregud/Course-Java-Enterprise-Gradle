package com.peregud.springmvc.util;

import com.peregud.springmvc.model.*;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@UtilityClass
public class DataGeneratorUtil {
    private final List<String> FIRST_NAMES;
    private final List<String> LAST_NAMES;
    private final List<String> COURSES;
    private final List<String> REVIEW;
    private final List<String> TASK;
    private final Random RANDOM = new Random();

    static {
        FIRST_NAMES = Arrays.asList("James", "Robert", "Michael", "David", "Richard");
        LAST_NAMES = Arrays.asList("Smith", "Johnson", "Williams", "Brown", "Jones");
        COURSES = Arrays.asList("Java", "C++", "Python", "JavaScript", "Swift");
        REVIEW = Arrays.asList("Excellent", "Good", "Not Bad", "Bad");
        TASK = Arrays.asList("Task 1", "Task 2", "Task 3", "Task 4", "Task 5");
    }

    public Admin generateAdmin() {
        return Admin.builder()
                .name(FIRST_NAMES.get(RANDOM.nextInt(FIRST_NAMES.size())))
                .build();
    }

    public Course generateCourse() {
        return Course.builder()
                .name(COURSES.get(RANDOM.nextInt(COURSES.size())))
                .build();
    }

    public Student generateStudent() {
        return Student.builder()
                .firstName(FIRST_NAMES.get(RANDOM.nextInt(FIRST_NAMES.size())))
                .lastName(LAST_NAMES.get(RANDOM.nextInt(LAST_NAMES.size())))
                .build();
    }

    public StudentResult generateStudentResult() {
        return StudentResult.builder()
                .mark((int) (Math.random() * (11 - 1)) + 1)
                .review(REVIEW.get(RANDOM.nextInt(REVIEW.size())))
                .build();
    }

    public Task generateTask() {
        return Task.builder()
                .taskName(TASK.get(RANDOM.nextInt(TASK.size())))
                .build();
    }

    public Teacher generateTeacher() {
        return Teacher.builder()
                .firstName(FIRST_NAMES.get(RANDOM.nextInt(FIRST_NAMES.size())))
                .lastName(LAST_NAMES.get(RANDOM.nextInt(LAST_NAMES.size())))
                .build();
    }
}
