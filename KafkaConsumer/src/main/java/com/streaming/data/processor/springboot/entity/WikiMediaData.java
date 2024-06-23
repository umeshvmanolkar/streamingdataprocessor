package com.streaming.data.processor.springboot.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "wikimedia_changes")
public class WikiMediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "wikiEventData", columnDefinition = "longtext")
    private String wikiEventData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }

    @Override
    public String toString() {
        return "WikiMediaData{" +
                "id=" + id +
                ", wikiEventData='" + wikiEventData + '\'' +
                '}';
    }
}
