package rest.messanger.database;

import java.util.HashMap;
import java.util.Map;

import rest.messanger.model.Message;
import rest.messanger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessage() {
		return messages;
	}

	public static Map<String, Profile> getProfile() {
		return profiles;
	}
}
