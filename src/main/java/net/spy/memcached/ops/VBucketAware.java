package net.spy.memcached.ops;

import net.spy.memcached.MemcachedNode;

import java.util.Collection;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public interface VBucketAware {
    void setVBucket(int vbucket);
    Collection<MemcachedNode> getNotMyVbucketNodes();
    void addNotMyVbucketNode(MemcachedNode node);
    void setNotMyVbucketNodes(Collection<MemcachedNode> nodes);
}
