package net.spy.memcached.vbucket.config;


import java.net.URI;
import java.util.List;

/**
 * Bucket configuration bean
 * @author alexander.sokolovsky.a@gmail.com
 */
public class Bucket {
    // Bucket name
    private String name;
    // vbuckets config
    private Config vbuckets;
    // bucket's streaming uri
    private URI streamingURI;

    // nodes list
    private List<Node> nodes;

    public Bucket(String name, Config vbuckets, URI streamingURI, List<Node> nodes) {
        this.name = name;
        this.vbuckets = vbuckets;
        this.streamingURI = streamingURI;
        this.nodes = nodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Config getVbuckets() {
        return vbuckets;
    }

    public void setVbuckets(Config vbuckets) {
        this.vbuckets = vbuckets;
    }

    public URI getStreamingURI() {
        return streamingURI;
    }

    public void setStreamingURI(URI streamingURI) {
        this.streamingURI = streamingURI;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bucket bucket = (Bucket) o;

        if (!name.equals(bucket.name)) return false;
        if (!nodes.equals(bucket.nodes)) return false;
        if (!vbuckets.equals(bucket.vbuckets)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + vbuckets.hashCode();
        result = 31 * result + nodes.hashCode();
        return result;
    }
}
