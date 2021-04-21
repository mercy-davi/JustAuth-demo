package me.zhyd.justauth.service;

import me.zhyd.oauth.model.AuthUser;

import java.util.List;

/**
 * @author hdw
 * @version 1.0.0
 */
public interface UserService {

    AuthUser save(AuthUser user);

    AuthUser getByUuid(String uuid);

    List<AuthUser> listAll();

    void remove(String uuid);
}
