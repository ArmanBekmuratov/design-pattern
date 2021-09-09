package com.arman.basepatterns.creational.prototype;

public class Program {
    public static void main(String[] args) {
        Website website= new Website(1,"google", "google.com" );

        System.out.println(website);

        WebsiteFactory websiteFactory = new WebsiteFactory(website);
        Website websiteClone = websiteFactory.cloneWebsite();
        System.out.println("---------------------");
        System.out.println(websiteClone);
    }
}
