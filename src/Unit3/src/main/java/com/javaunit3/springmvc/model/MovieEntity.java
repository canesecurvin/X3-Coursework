package com.javaunit3.springmvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class MovieEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "maturity_rating")
    private String maturity_rating;
    @Column(name = "genre")
    private String genre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private List<VoteEntity> vote;

    public int getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public String getMaturityRating(){
        return maturity_rating;
    }

    public String getGenre(){
        return genre;
    }

    public List<VoteEntity> getVotes(){
        return vote;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setMaturityRating(String maturity_rating){
        this.maturity_rating = maturity_rating;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setVotes(List<VoteEntity> vote){
        this.vote = vote;
    }

    public void addVote(VoteEntity vote){
        this.vote.add(vote);
    }
}