package redis.clients.jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author guy
 */
public interface BinaryRedisPipeline {
    Response<Long> append(byte[] key, byte[] value);

    Response<Long> decr(byte[] key);

    Response<Long> decrBy(byte[] key, long integer);

    Response<Boolean> exists(byte[] key);

    Response<Long> expire(byte[] key, int seconds);

    Response<Long> expireAt(byte[] key, long unixTime);

    Response<byte[]> get(byte[] key);

    Response<Boolean> getbit(byte[] key, long offset);

    Response<byte[]> getSet(byte[] key, byte[] value);

    Response<Long> getrange(byte[] key, long startOffset, long endOffset);

    Response<Long> hdel(byte[] key, byte[] field);

    Response<Boolean> hexists(byte[] key, byte[] field);

    Response<String> hget(byte[] key, byte[] field);

    Response<Map<String, String>> hgetAll(byte[] key);

    Response<Long> hincrBy(byte[] key, byte[] field, long value);

    Response<Set<String>> hkeys(byte[] key);

    Response<Long> hlen(byte[] key);

    Response<List<String>> hmget(byte[] key, byte[]... fields);

    Response<String> hmset(byte[] key, Map<byte[], byte[]> hash);

    Response<Long> hset(byte[] key, byte[] field, byte[] value);

    Response<Long> hsetnx(byte[] key, byte[] field, byte[] value);

    Response<List<String>> hvals(byte[] key);

    Response<Long> incr(byte[] key);

    Response<Long> incrBy(byte[] key, long integer);

    Response<String> lindex(byte[] key, int index);

    Response<Long> linsert(byte[] key, BinaryClient.LIST_POSITION where,
                           byte[] pivot, byte[] value);

    Response<Long> llen(byte[] key);

    Response<String> lpop(byte[] key);

    Response<Long> lpush(byte[] key, byte[] string);

    Response<Long> lpushx(byte[] key, byte[] bytes);

    Response<List<String>> lrange(byte[] key, long start, long end);

    Response<Long> lrem(byte[] key, long count, byte[] value);

    Response<String> lset(byte[] key, long index, byte[] value);

    Response<String> ltrim(byte[] key, long start, long end);

    Response<Long> persist(byte[] key);

    Response<String> rpop(byte[] key);

    Response<Long> rpush(byte[] key, byte[] string);

    Response<Long> rpushx(byte[] key, byte[] string);

    Response<Long> sadd(byte[] key, byte[] member);

    Response<Long> scard(byte[] key);

    Response<String> set(byte[] key, byte[] value);

    Response<Boolean> setbit(byte[] key, long offset, byte[] value);

    Response<Long> setrange(byte[] key, long offset, byte[] value);

    Response<String> setex(byte[] key, int seconds, byte[] value);

    Response<Long> setnx(byte[] key, byte[] value);

    Response<Long> setrange(String key, long offset, String value);

    Response<Set<String>> smembers(byte[] key);

    Response<Boolean> sismember(byte[] key, byte[] member);

    Response<Long> sort(byte[] key);

    Response<List<String>> sort(byte[] key,
                                SortingParams sortingParameters);

    Response<String> spop(byte[] key);

    Response<String> srandmember(byte[] key);

    Response<Long> srem(byte[] key, byte[] member);

    Response<Long> strlen(byte[] key);

    Response<String> substr(byte[] key, int start, int end);

    Response<Long> ttl(byte[] key);

    Response<String> type(byte[] key);

    Response<Long> zadd(byte[] key, double score, byte[] member);

    Response<Long> zcard(byte[] key);

    Response<Long> zcount(byte[] key, double min, double max);

    Response<Double> zincrby(byte[] key, double score, byte[] member);

    Response<Set<String>> zrange(byte[] key, int start, int end);

    Response<Set<String>> zrangeByScore(byte[] key, double min,
                                        double max);

    Response<Set<String>> zrangeByScore(byte[] key, byte[] min,
                                        byte[] max);

    Response<Set<String>> zrangeByScore(byte[] key, double min,
                                        double max, int offset, int count);

    Response<Set<String>> zrangeByScore(byte[] key, byte[] min,
                                        byte[] max, int offset, int count);

    Response<Set<Tuple>> zrangeByScoreWithScores(byte[] key, double min,
                                                 double max);

    Response<Set<Tuple>> zrangeByScoreWithScores(byte[] key, byte[] min,
                                                 byte[] max);

    Response<Set<Tuple>> zrangeByScoreWithScores(byte[] key, double min,
                                                 double max, int offset, int count);

    Response<Set<Tuple>> zrangeByScoreWithScores(byte[] key, byte[] min,
                                                 byte[] max, int offset, int count);

    Response<Set<String>> zrevrangeByScore(byte[] key, double max,
                                           double min);

    Response<Set<String>> zrevrangeByScore(byte[] key, byte[] max,
                                           byte[] min);

    Response<Set<String>> zrevrangeByScore(byte[] key, double max,
                                           double min, int offset, int count);

    Response<Set<String>> zrevrangeByScore(byte[] key, byte[] max,
                                           byte[] min, int offset, int count);

    Response<Set<Tuple>> zrevrangeByScoreWithScores(byte[] key,
                                                    double max, double min);

    Response<Set<Tuple>> zrevrangeByScoreWithScores(byte[] key,
                                                    byte[] max, byte[] min);

    Response<Set<Tuple>> zrevrangeByScoreWithScores(byte[] key,
                                                    double max, double min, int offset, int count);

    Response<Set<Tuple>> zrevrangeByScoreWithScores(byte[] key,
                                                    byte[] max, byte[] min, int offset, int count);

    Response<Set<Tuple>> zrangeWithScores(byte[] key, int start, int end);

    Response<Long> zrank(byte[] key, byte[] member);

    Response<Long> zrem(byte[] key, byte[] member);

    Response<Long> zremrangeByRank(byte[] key, int start, int end);

    Response<Long> zremrangeByScore(byte[] key, double start, double end);

    Response<Long> zremrangeByScore(byte[] key, byte[] start, byte[] end);

    Response<Set<String>> zrevrange(byte[] key, int start, int end);

    Response<Set<Tuple>> zrevrangeWithScores(byte[] key, int start,
                                             int end);

    Response<Long> zrevrank(byte[] key, byte[] member);

    Response<Double> zscore(byte[] key, byte[] member);
}
