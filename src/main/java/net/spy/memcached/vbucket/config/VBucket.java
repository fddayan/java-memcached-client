package net.spy.memcached.vbucket.config;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public class VBucket {

    public final static int MAX_REPLICAS = 4;

    public final static int MAX_BUCKETS = 65536;

    private int[] servers = new int[MAX_REPLICAS + 1];

    public int[] getServers() {
        return servers;
    }
}
