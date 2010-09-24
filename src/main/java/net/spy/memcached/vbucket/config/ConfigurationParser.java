package net.spy.memcached.vbucket.config;

import net.spy.memcached.vbucket.config.Bucket;
import net.spy.memcached.vbucket.config.Pool;

import java.text.ParseException;
import java.util.Map;

/**
 * @author alexander.sokolovsky.a@gmail.com
 */
public interface ConfigurationParser {
    Map<String, Pool> parseBase(final String base) throws ParseException;
    Map<String, Bucket> parseBuckets(String buckets) throws ParseException;
    Bucket parseBucket(String sBucket) throws ParseException;
    void loadPool(Pool pool, String sPool) throws ParseException;
}
