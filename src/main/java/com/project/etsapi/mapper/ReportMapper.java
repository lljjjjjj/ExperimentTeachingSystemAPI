package com.project.etsapi.mapper;

import com.project.etsapi.entity.Report;
import com.project.etsapi.vo.ProjectScoreInfo;
import com.project.etsapi.vo.ReportInfo;
import com.project.etsapi.vo.StuProScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportMapper {
    List<ProjectScoreInfo> getProjectScoreInfoList(String course_ID);

    void addReport(Report report);

    Report getReport(String course_ID, String student_ID, String project_name);

    void updateReport(Report report);

    List<ReportInfo> getTotalReportList(String course_ID, String project_name);

    List<StuProScore> getStuProScoreList(String course_ID, String student_ID);
}