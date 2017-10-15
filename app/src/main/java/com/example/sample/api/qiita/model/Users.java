package com.example.sample.api.qiita.model;

/**
 * Created by other on 2017/10/05.
 */
public class Users {

    /**
     * self-description.<br/>
     * Example: "Hello, world.".<br/>
     * Type: null, string
     */
    public String description;

    /**
     * Facebook ID.<br/>
     * Example: "yaotti".<br/>
     * Type: null, string
     */
    public String faceboo_id;

    /**
     * Followees count.<br/>
     * Example: 100.<br/>
     * Type: integer
     */
    public Integer followees_count;

    /**
     * Followers count.<br/>
     * Example: 200.<br/>
     * Type: integer
     */
    public Integer followers_count;

    /**
     * GitHub ID.<br/>
     * Example: "yaotti".<br/>
     * Type: null, string
     */
    public String github_login_name;

    /**
     * User ID.<br/>
     * Example: "yaotti".<br/>
     * Type: null, string
     */
    public String id;

    /**
     * How many items a user posted on qiita.com (Items on Qiita:Team are not included).<br/>
     * Example: 300.<br/>
     * Type: integer
     */
    public Integer items_count;

    /**
     * LinkedIn ID.<br/>
     * Example: "yaotti".<br/>
     * Type: null, string
     */
    public String linkedin_id;

    /**
     * Location.<br/>
     * Example: "Tokyo, Japan".<br/>
     * Type: null, string
     */
    public String location;

    /**
     * Customized user name.<br/>
     * Example: "Hiroshige Umino".<br/>
     * Type: null, string
     */
    public String name;

    /**
     * Organization which a user belongs to.<br/>
     * Example: "Increments Inc".<br/>
     * Type: null, string
     */
    public String organization;

    /**
     * Unique integer ID.<br/>
     * Example: 1.<br/>
     * Type: integer
     */
    public Integer permanent_id;

    /**
     * Profile image URL.<br/>
     * Example: "https://si0.twimg.com/profile_images/2309761038/1ijg13pfs0dg84sk2y0h_normal.jpeg".<br/>
     * Type: null, string
     */
    public String profile_image_url;

    /**
     * Twitter screen name.<br/>
     * Example: "yaotti".<br/>
     * Type: null, string
     */
    public String twitter_screen_name;

    /**
     * Website URL.<br/>
     * Example: "http://yaotti.hatenablog.com".<br/>
     * Type: null, string
     */
    public String website_url;

    /**
     * Monthly image upload limit.<br/>
     * Example: 1048576.<br/>
     * Type: integer
     */
    public Integer image_monthly_upload_limit;

    /**
     * Monthly remaining image upload size.<br/>
     * Example: 524288.<br/>
     * Type: integer
     */
    public Integer image_monthly_upload_remaining;

    /**
     * A flag whether this user is configured as team-only.<br/>
     * Example: false.<br/>
     * Type: boolean
     */
    public Boolean team_only;
}

