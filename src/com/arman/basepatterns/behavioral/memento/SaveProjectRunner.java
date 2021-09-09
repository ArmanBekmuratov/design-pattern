package com.arman.basepatterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project");
        project.setVersionAndDate("1.0");

        System.out.println(project);

        githubRepo.setSave(project.save());
    }
}
