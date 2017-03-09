package rest.messanger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rest.messanger.database.DatabaseClass;
import rest.messanger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles = DatabaseClass.getProfile();

	public ProfileService() {
		profiles.put("Fikir", new Profile(1L, "Fikir", "Fikir","Debele"));
	}
	public List<Profile> getAllProfile(){
		return new ArrayList<Profile>(profiles.values());
	}
	public Profile getProfile(String profilename){
		return profiles.get(profilename);
	}
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	public Profile uppdateProfile(Profile profile){
		if(profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	public void removeProfile(String profileName){
		profiles.remove(profileName);
	}
}
