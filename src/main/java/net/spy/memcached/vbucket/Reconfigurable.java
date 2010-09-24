package net.spy.memcached.vbucket;

import net.spy.memcached.vbucket.config.Bucket;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public interface Reconfigurable {
    void reconfigure(Bucket bucket);
}
