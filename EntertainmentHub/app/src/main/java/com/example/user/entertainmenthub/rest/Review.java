package com.example.user.entertainmenthub.rest;

/**
 * Created by user on 10-11-2017.
 */

import com.google.gson.annotations.SerializedName;

/**
 *
 */
public class Review {

    @SerializedName("id")
    String id;

    @SerializedName("author")
    String author;

    @SerializedName("content")
    String content;

    @SerializedName("url")
    String url;

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }
}
