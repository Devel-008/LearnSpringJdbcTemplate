package com.practice.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionTypes {

    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;
    private Properties props;

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public CollectionTypes() {
        super();
    }

    public CollectionTypes(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CollectionTypes{" +
                "name='" + name + '\'' +"\n"+
                ", phones=" + phones +"\n"+
                ", address=" + address +"\n"+
                ", courses=" + courses +"\n"+
                ", props=" + props +
                '}';
    }
}
