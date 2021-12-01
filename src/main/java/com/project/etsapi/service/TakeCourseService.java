package com.project.etsapi.service;

import com.project.etsapi.entity.Student;
import com.project.etsapi.entity.TakeCourse;
import com.project.etsapi.vo.StudentInfo;

import java.util.List;

public interface TakeCourseService {
    int addTakeCourse(TakeCourse takeCourse);

    int deleteTakeCourse(TakeCourse takeCourse);

    TakeCourse getTakeCourse(String student_ID, String course_ID);

    List<Student> getStudentListByCourseId(String course_ID, String is_student);

    List<StudentInfo> getStudentInfoListByCourseId(String course_ID, String is_student);
}