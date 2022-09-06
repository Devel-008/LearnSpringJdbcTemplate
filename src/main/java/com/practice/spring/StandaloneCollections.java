package com.practice.spring;

import java.util.List;
import java.util.Map;

public class StandaloneCollections {
    private List<String>friends;
    private Map<String,Integer> fees;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFees() {
        return fees;
    }

    public void setFees(Map<String, Integer> fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "StandaloneCollections{" +
                "friends=" + friends +
                ",\n fees=" + fees +
                '}';
    }
}
