package net.spy.memcached.vbucket.config;

import net.spy.memcached.HashAlgorithm;

import java.util.List;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */

public interface Config {

    // Config access

    int getReplicasCount();

    int getVbucketsCount();

    int getServersCount();

    HashAlgorithm getHashAlgorithm();

    String getServer(int serverIndex);

    // VBucket access

    int getVbucketByKey(String key);

    int getMaster(int vbucketIndex);

    int getReplica(int vbucketIndex, int replicaIndex);

    int foundIncorrectMaster(int vbucket, int wrongServer);

    void setServers(List<String> servers);

    void setVbuckets(List<VBucket> vbuckets);

    ConfigDifference compareTo(Config config);

    List<String> getServers();

    List<VBucket> getVbuckets();


}
