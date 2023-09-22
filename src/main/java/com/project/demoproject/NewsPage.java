package com.project.demoproject;
public class NewsPage {
    private News news;
    private String pageUrl;

    public NewsPage() {
    }

    public NewsPage(News news, String pageUrl) {
        this.news = news;
        this.pageUrl = pageUrl;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
}
