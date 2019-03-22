package com.zzz.chen.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class BaseAttrValue implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    @Column
    private String valueName;
    @Column
    private String attrId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }
}
