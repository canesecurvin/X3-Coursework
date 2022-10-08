package com.javaunit3.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "votes")
public class VoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "voterName")
    private String voterName;

    public VoteEntity(){}

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getVoterName(){
        return this.voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
}
