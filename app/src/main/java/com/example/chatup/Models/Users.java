package com.example.chatup.Models;

public class Users {
  String profilePic,userName,mail,password,lastMessage,status,userId;

    public Users()
    {

    }

  public Users(String profilePic, String userName, String mail, String password, String lastMessage, String status,String userId) {
    this.profilePic = profilePic;
    this.userName = userName;
    this.mail = mail;
    this.password = password;
    this.lastMessage = lastMessage;
    this.status = status;
    this.userId=userId;
  }

  public Users(String userName, String mail, String password) {
    this.userName = userName;
    this.mail = mail;
    this.password = password;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getProfilePic() {
    return profilePic;
  }

  public void setProfilePic(String profilePic) {
    this.profilePic = profilePic;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getLastMessage() {
    return lastMessage;
  }

  public void setLastMessage(String lastMessage) {
    this.lastMessage = lastMessage;
  }

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }

}
