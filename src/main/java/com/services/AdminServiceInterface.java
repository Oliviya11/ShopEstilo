package com.services;

import com.users.Admin;

public interface AdminServiceInterface {

    void addAdmin(Admin admin);
    void updateAdmin(long id, Admin admin);
    Admin getAdminByLogin(String login);

}
