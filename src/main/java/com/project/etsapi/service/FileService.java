package com.project.etsapi.service;

import com.project.etsapi.entity.File;
import com.project.etsapi.entity.Project;
import com.project.etsapi.vo.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    Boolean addFile(File file);

    File getFile(String course_ID,String file_name,String path);

    List<FileInfo> getFileInfoListByPath(String course_ID, String path);

    List<String> getFileNameListByPath(String course_ID, Boolean isProject);

    int deleteFileByProject(Project project);

    void saveProjectFiles(Project project, List<MultipartFile> fileList) throws Exception;

    void saveFile(MultipartFile file,String course_ID,String path) throws Exception;

    List<File> getFiles(String course_ID, String isProject);

    List<String> getFileNameByFolder(String folder, List<File> files);

    void savePhoto(MultipartFile file, String course_ID) throws Exception;

    MultipartFile getPhoto(String course_ID);
}
