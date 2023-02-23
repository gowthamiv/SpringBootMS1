package com.user.management.service;

public interface UserService {

    public User getUserService(String id);
    public User createUserService(User user);
    public User updateUserService(String id, User user);
    public String deleteUserService(String id);
}
