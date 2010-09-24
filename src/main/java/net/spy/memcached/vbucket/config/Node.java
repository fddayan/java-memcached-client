package net.spy.memcached.vbucket.config;

import java.util.Map;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public class Node {
    private Status status;
    private String hostname;
    private Map<Port, String> ports;

    public Node(Status status, String hostname, Map<Port, String> ports) {
        this.status = status;
        this.hostname = hostname;
        this.ports = ports;
    }

    public Status getStatus() {
        return status;
    }

    public String getHostname() {
        return hostname;
    }

    public Map<Port, String> getPorts() {
        return ports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (!hostname.equals(node.hostname)) return false;
        if (!ports.equals(node.ports)) return false;
        if (status != node.status) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + hostname.hashCode();
        result = 31 * result + ports.hashCode();
        return result;
    }
}
