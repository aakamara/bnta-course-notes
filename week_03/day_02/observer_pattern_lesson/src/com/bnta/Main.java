package com.bnta;

import com.bnta.interfaces.IObserver;
import com.bnta.news.NewsFeed;

public class Main {

    public static void main(String[] args) {
	// anonymous class
    // create 1 instance of a class
    // anonymous is a once off implementation of an interface
    // it's datatype is the interface type - in this example, IObserver
        IObserver scraper = new IObserver() {
            @Override
            public void update(String message) {
                System.out.println("from scraper" + message);
            }
        };

        IObserver aggregator = new IObserver() {
            @Override
            public void update(String message) {
                System.out.println(" from aggregator:" + message);
            }
        };

        NewsFeed nf= new NewsFeed(); //takes no arugments
        nf.addObserver(scraper); //pass in the IObserver
        nf.addObserver(aggregator);

        nf.callObserver(" Our first bit of news!");

    }
}
