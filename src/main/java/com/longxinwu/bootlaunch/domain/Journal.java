package com.longxinwu.bootlaunch.domain;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用了JPA技术，所以你需要使用@Entity, @Id和@GeneratedValue注解，因此这个类被标记作为JPA实体并且能够被持久化到数据库中。
 * 你也可以看到，在我们的代码中也使用了@Transient注解，这个注解表示JPA引擎不会持久化被注解的属性，
 * 因为上面的代码片中被@Transient注解的属性仅仅只是用来格式化日期。
 * 这个类有两个构造函数，一个没有参数，JPA引擎需要这个构造函数，另外一个构造函数需要用来填充数据库的参数。
 */

@Entity
public class Journal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    //private Date created;
    private String summary;
    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    Journal(){}
    public Journal(String title, String summary) throws ParseException {
        this.title = title;
        this.summary = summary;
        //this.created = format.parse(date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public Date getCreated() {
        return created;
    }*/

    /*public void setCreated(Date created) {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }*/

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /*public String getCreatedAsShort(){
        return format.format(created);
    }*/
    @Override
    public String toString(){
        StringBuilder value = new StringBuilder("JournalEntry(");
        value.append("Id: ");
        value.append(id);
        value.append(",Title: ");
        value.append(title);
        value.append(",Summary: ");
        value.append(summary);
        value.append(")");
        return value.toString();
    }
}
