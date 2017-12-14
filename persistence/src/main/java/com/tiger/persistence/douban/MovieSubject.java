package com.tiger.persistence.douban;

/**
 * Created by tigershen on 2017/12/13.
 */

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "MovieSubject")
public class MovieSubject {

    /**
     * max : 10
     * average : 9
     * stars : 45
     * min : 0
     */
    @Embedded
    private RatingBean rating;
    /**
     * rating : {"max":10,"average":9.6,"stars":"45","min":0}
     * genres : ["剧情"]
     * title : 楚门的世界
     * casts : [{"alt":"https://movie.douban.com/celebrity/1054438/","avatars":{"small":"http://img3.douban.com/img/celebrity/small/615.jpg","large":"http://img3.douban.com/img/celebrity/large/615.jpg","medium":"http://img3.douban.com/img/celebrity/medium/615.jpg"},"name":"金·凯瑞","id":"1054438"},{"alt":"https://movie.douban.com/celebrity/1053572/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/516.jpg","large":"http://img3.doubanio.com/img/celebrity/large/516.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/516.jpg"},"name":"劳拉·琳妮","id":"1053572"},{"alt":"https://movie.douban.com/celebrity/1048024/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/277.jpg","large":"http://img3.doubanio.com/img/celebrity/large/277.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/277.jpg"},"name":"艾德·哈里斯","id":"1048024"}]
     * collect_count : 483196
     * original_title : The Truman Show
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1022721/","avatars":{"small":"http://img3.douban.com/img/celebrity/small/4360.jpg","large":"http://img3.douban.com/img/celebrity/large/4360.jpg","medium":"http://img3.douban.com/img/celebrity/medium/4360.jpg"},"name":"彼得·威尔","id":"1022721"}]
     * year : 1998
     * images : {"small":"http://img3.douban.com/view/movie_poster_cover/ipst/public/p479682972.jpg","large":"http://img3.douban.com/view/movie_poster_cover/lpst/public/p479682972.jpg","medium":"http://img3.douban.com/view/movie_poster_cover/spst/public/p479682972.jpg"}
     * alt : https://movie.douban.com/subject/1292064/
     * id : 1292064
     */
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "collect_count")
    private int collect_count;
    @ColumnInfo(name = "original_title")
    private String original_title;
    @ColumnInfo(name = "subtype")
    private String subtype;
    @ColumnInfo(name = "year")
    private String year;
    /**
     * small : http://img3.douban.com/view/movie_poster_cover/ipst/public/p479682972.jpg
     * large : http://img3.douban.com/view/movie_poster_cover/lpst/public/p479682972.jpg
     * medium : http://img3.douban.com/view/movie_poster_cover/spst/public/p479682972.jpg
     */
    @Embedded
    private ImagesBean images;
    @ColumnInfo(name = "alt")
    private String alt;
    @PrimaryKey
    private String id;

    private List<String> genres;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public static class RatingBean{
        @ColumnInfo(name = "stars")
        private String stars;
        @ColumnInfo(name = "max")
        private int max;
        @ColumnInfo(name = "average")
        private float average;
        @ColumnInfo(name = "min")
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public float getAverage() {
            return average;
        }

        public void setAverage(float average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean{
        @ColumnInfo(name = "small")
        private String small;
        @ColumnInfo(name = "large")
        private String large;
        @ColumnInfo(name = "medium")
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }
}

