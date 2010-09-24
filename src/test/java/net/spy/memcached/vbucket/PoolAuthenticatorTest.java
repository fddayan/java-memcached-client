/*
 * Copyright (c) 2009, NorthScale, Inc.
 *
 * All rights reserved.
 *
 * info@northscale.com
 *
 */

package net.spy.memcached.vbucket;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Eugene Shelestovich
 * @version : $
 */
public class PoolAuthenticatorTest extends TestCase {

    public void setUp() {

    }

    public void testPoolAuthenticator() throws Exception {
        final String username = "test_username";
        final String password = "test_password";

        PoolAuthenticator authenticator = new PoolAuthenticator(username, password);
        assertNotNull(authenticator.getPasswordAuthentication());

        try {
            authenticator = new PoolAuthenticator(null, null);
            fail("Username and password must be defined. Exception must be thrown.");
        } catch (IllegalArgumentException e) {
            // ok
        }
    }

}
