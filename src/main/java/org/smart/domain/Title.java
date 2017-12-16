package org.smart.domain;

/**
 * @Author: LAL
 * @Description:
 * @Date Created on 2017/12/15.
 */
public class Title {
    private Integer id;
    private String name;

    public Title() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
