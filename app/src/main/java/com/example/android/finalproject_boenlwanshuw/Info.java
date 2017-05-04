package com.example.android.finalproject_boenlwanshuw;

import java.io.Serializable;

/**
 * Created by Addie on 2017/5/3.
 */

public class Info implements Serializable {
    private String title;
    private String desc;
    private int photoId;

    /**
     * Constructs a new instance of {@code Object}.
     */
    public Info(String name, String desc, int photoId) {
        this.title = name;
        this.desc = desc;
        this.photoId = photoId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getDesc() {
        return desc;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }
}
