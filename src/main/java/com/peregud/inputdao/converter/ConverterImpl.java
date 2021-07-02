package com.peregud.inputdao.converter;

import com.peregud.inputdao.model.Course;
import com.peregud.inputdao.model.Student;
import com.peregud.inputdao.model.Teacher;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConverterImpl {
    private static final Map<Class<?>, Converter<?>> CONVERTER_MAP;
    private static final Converter<Student> STUDENT_CONVERTER = new StudentConverter();
    private static final Converter<Course> COURSE_CONVERTER = new CourseConverter();
    private static final Converter<Teacher> TEACHER_CONVERTER = new TeacherConverter();

    static {
        CONVERTER_MAP = new HashMap<>();
        CONVERTER_MAP.put(Student.class, STUDENT_CONVERTER);
        CONVERTER_MAP.put(Course.class, COURSE_CONVERTER);
        CONVERTER_MAP.put(Teacher.class, TEACHER_CONVERTER);
    }

    public static Converter<?> getConverter(Class<?> clazz) throws Exception {
        return Optional.ofNullable(CONVERTER_MAP.get(clazz)).orElseThrow(Exception::new);
    }
}
