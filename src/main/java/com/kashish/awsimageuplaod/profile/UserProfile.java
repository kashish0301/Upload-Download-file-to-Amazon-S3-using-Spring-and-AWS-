package com.kashish.awsimageuplaod.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private final UUID userProfileId;
    private final String username;
    private String userProfileImagelink;//s3 key

    public UserProfile(UUID userProfileId, String username, String userProfileImagelink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImagelink = userProfileImagelink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImagelink() {
        return Optional.ofNullable(userProfileImagelink);
    }

    public void setUserProfileImagelink(String userProfileImagelink) {
        this.userProfileImagelink = userProfileImagelink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId,that.userProfileId) && Objects.equals(username,that.username) && Objects.equals(userProfileImagelink,that.userProfileImagelink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImagelink);
    }
}
