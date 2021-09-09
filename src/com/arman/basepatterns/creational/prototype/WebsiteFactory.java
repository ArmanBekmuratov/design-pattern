package com.arman.basepatterns.creational.prototype;

public class WebsiteFactory {
    Website website;

    public WebsiteFactory(Website website) {
        this.website = website;
    }

    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    Website cloneWebsite() {
        return (Website) website.copy();
    }
}
