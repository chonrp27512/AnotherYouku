package com.huskyyy.anotheryouku.data.base;

/**
 * Created by Wang on 2016/8/15.
 */
public class MarkFavoriteResponse {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MarkFavoriteResponse{" +
                "id='" + id + '\'' +
                '}';
    }
}
