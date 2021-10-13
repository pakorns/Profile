package com.comsci.profile;

public class Profile {
    private String name;
    private String lname;
    private String phone;
    private String profilePic;
    private String permission;

    public Profile() {
    }

    public Profile(String name, String lname, String phone, String profilePic, String permission) {
        this.name = name;
        this.lname = lname;
        this.phone = phone;
        this.profilePic = profilePic;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
