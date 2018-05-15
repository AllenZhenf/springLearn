package main.java.springLearn.noSql.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.Jedis;

public class RedisExample {
    @Bean
    public RedisConnectionFactory redisCF(){
       JedisConnectionFactory connectionFactory=new JedisConnectionFactory();
       connectionFactory.setHostName("192.168.205.133");
       connectionFactory.setPort(6379);
       connectionFactory.setUsePool(true);
//       connectionFactory.afterPropertiesSet();
        return connectionFactory;
    }

    public void RedisConnect(){
        RedisConnectionFactory redisConnectionFactory=redisCF();
        RedisConnection redisConnection=redisConnectionFactory.getConnection();
        redisConnection.set("greeting".getBytes(),"Hello World".getBytes());
        byte[] greetingBytes=redisConnection.get("greeting".getBytes());
        String greeting=new String(greetingBytes);
    }

    public static void main(String[] args) {
//        RedisExample re=new RedisExample();
//        re.RedisConnect();
        Jedis jedis=new Jedis("192.168.205.133",6379);
        jedis.set("key","value");
        System.out.println(jedis.get("key"));
    }


}
