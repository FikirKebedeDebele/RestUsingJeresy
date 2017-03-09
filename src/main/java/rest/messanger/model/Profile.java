package rest.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
private long id;
private String profileName;
private String lastName;
private String firstName;
private Date created;
public Profile(long id, String profileName,String firstName, String lastName) {
	super();
	this.id = id;
	this.profileName = profileName;
	this.lastName = lastName;
	this.firstName = firstName;
}
public Profile() {
	super();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}

}
