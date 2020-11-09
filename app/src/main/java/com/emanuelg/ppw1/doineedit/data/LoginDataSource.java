package com.emanuelg.ppw1.doineedit.data;

import android.content.Intent;

import com.emanuelg.ppw1.doineedit.MainActivity;
import com.emanuelg.ppw1.doineedit.data.model.LoggedInUser;

import java.io.IOException;

import androidx.core.content.ContextCompat;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");



            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}