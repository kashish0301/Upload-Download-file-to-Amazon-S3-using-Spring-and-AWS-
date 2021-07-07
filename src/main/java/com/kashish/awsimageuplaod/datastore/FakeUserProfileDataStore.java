package com.kashish.awsimageuplaod.datastore;

import com.kashish.awsimageuplaod.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("d3a62679-18b7-4660-98a4-14923834790c"),"Janet", "null"));
        USER_PROFILES.add(new UserProfile(UUID.fromString("f7e1d0da-96c4-425d-9dee-7e61bfe01c66"),"Ricky", "null"));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
