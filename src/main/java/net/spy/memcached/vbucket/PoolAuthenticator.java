/*
 * Copyright (c) 2009, NorthScale, Inc.
 *
 * All rights reserved.
 *
 * info@northscale.com
 *
 */

package net.spy.memcached.vbucket;

import java.net.PasswordAuthentication;

/**
 * @author ingenthr
 */
public class PoolAuthenticator extends java.net.Authenticator {

    private final PasswordAuthentication auth;

    public PoolAuthenticator(String username, String password) {
        super();
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username or Password is not defined.");
        } else {
            this.auth = new PasswordAuthentication(username, password.toCharArray());
        }
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return auth;
    }


}
