package net.spy.memcached.vbucket.config;

import org.codehaus.jettison.json.JSONObject;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public interface ConfigFactory {

    Config createConfigFromFile(String filename);

    Config createConfigFromString(String data);

    Config createConfigFromJSON(JSONObject jsonObject);
}
