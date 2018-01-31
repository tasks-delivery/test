package com.task.delivery.service.project;

import com.task.delivery.model.Project;
import com.task.delivery.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void save(Project project) {
        project.setId(project.getId());
        project.setProjectName(project.getProjectName());
        projectRepository.save(project);
    }

    @Override
    public Project findByProjectName(String projectName) {
        return projectRepository.findByProjectName(projectName);
    }

}
