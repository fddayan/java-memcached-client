package net.spy.memcached.vbucket.config;

import net.spy.memcached.vbucket.config.Bucket;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Pool represents a collection of buckets
 * @author alexander.sokolovsky.a@gmail.com
 */
public class Pool {
    // it's base uri
    private URI base;
    // pool name
    private String name;
    // pool's uri
    private URI uri;
    // pool's streaming uri
    private URI streamingUri;
    // buckets uri
    private Map<String, Bucket> buckets = new ConcurrentHashMap<String, Bucket>();
    // buckets related to this pool
    private URI bucketsUri;

    public Pool() {
        super();
    }

    public Pool(String name, URI uri, URI streamingUri) {
        this.name = name;
        this.uri = uri;
        this.streamingUri = streamingUri;
    }

    public URI getBase() {
        return base;
    }

    public String getName() {
        return name;
    }

    public URI getUri() {
        return uri;
    }

    public URI getStreamingUri() {
        return streamingUri;
    }

    public Map<String, Bucket> getBuckets() {
        return buckets;
    }

    public URI getBucketsUri() {
        return bucketsUri;
    }

    void setBucketsUri(URI bucketsUri) {
        this.bucketsUri = bucketsUri;
    }
}
