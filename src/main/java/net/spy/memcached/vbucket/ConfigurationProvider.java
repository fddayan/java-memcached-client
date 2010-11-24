package net.spy.memcached.vbucket;


import net.spy.memcached.vbucket.config.Bucket;

import javax.naming.ConfigurationException;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public interface ConfigurationProvider {

    /**
     * Connects to the REST service and retrieves the bucket configuration from the first pool available
     * @param bucketname bucketname
     * @return vbucket configuration
     * @throws ConfigurationException
     */
    Bucket getBucketConfiguration(String bucketname) throws ConfigurationException;

    /**
     * Subscribes for configuration updates
     * @param bucketName bucket name to receive configuration for
     * @param rec reconfigurable that will receive updates
     * @throws ConfigurationException
     */
    void subscribe(final String bucketName, final Reconfigurable rec) throws ConfigurationException;

    /**
     * Unsubscribe from updates on a given bucket and given reconfigurable
     * @param vbucketName bucket name
     * @param rec reconfigurable
     */
    void unsubscribe(final String vbucketName, final Reconfigurable rec);

    /**
     * Shutdowns a monitor connections to the REST service
     */
    void shutdown();

    /**
     * Retrieves a default bucket name i.e. 'default'
     * @return
     */
    String getAnonymousAuthBucket();
}
