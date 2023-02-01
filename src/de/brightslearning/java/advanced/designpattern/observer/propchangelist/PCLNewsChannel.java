package de.brightslearning.java.advanced.designpattern.observer.propchangelist;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    private void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return this.news;
    }

    // standard getter and setter
}
