package com.project.demoproject;
public class Project {
    private NewsPage newsPage;
    private String projectName;

    public Project() {
    }

    public Project(NewsPage newsPage, String projectName) {
        this.newsPage = newsPage;
        this.projectName = projectName;
    }

    public NewsPage getNewsPage() {
        return newsPage;
    }

    public void setNewsPage(NewsPage newsPage) {
        this.newsPage = newsPage;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
