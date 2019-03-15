package com.example.user.hanzip.network.response;

import com.google.gson.annotations.SerializedName;

public class LoginResult {
    @SerializedName("success")
    public boolean success = false;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @SerializedName("id")
    private String userid = "";

    @SerializedName("name")
    private String name ="";

    @SerializedName("phoneNumber")
    private String phoneNumber ="";

    @SerializedName("address")
    private String address ="";

    @SerializedName("age")
    private String age ="";

    @SerializedName("role")
    private String role ="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
