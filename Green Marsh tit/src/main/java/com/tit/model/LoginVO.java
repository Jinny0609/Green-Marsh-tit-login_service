package com.tit.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginVO  {
	 private String id;
	    private String email;
	    private String nickname;
	    private String profile_image;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getNickname() {
	        return nickname;
	    }

	    public void setNickname(String nickname) {
	        this.nickname = nickname;
	    }

	    public String getProfile_image() {
	        return profile_image;
	    }

	    public void setProfile_image(String profile_image) {
	        this.profile_image = profile_image;
	    }
    
    @Override
    public String toString() {
        return "KakaoUserInfoVO [id=" + id + ", email=" + email + ", nickname=" + nickname
                + ", profile_image=" + profile_image + "]";
    }
}