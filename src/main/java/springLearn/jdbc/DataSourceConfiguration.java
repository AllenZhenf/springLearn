package main.java.springLearn.jdbc;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

public class DataSourceConfiguration {

    @Profile("development")//开发数据源
    @Bean
    public DataSource embeddedDataSource(){
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
                .addScript("").addScript("").build();
    }

    @Profile("qa")//qa数据源
    @Bean
    public DataSource Data(){
        BasicDataSource basicDataSource=new BasicDataSource();
        basicDataSource.setDriverClassName("org.H2.Driver");
        basicDataSource.setUrl("jdbc:h2:tcp://localhost/~/spitter");
        basicDataSource.setUsername("szf");
        basicDataSource.setPassword("123456");
        basicDataSource.setInitialSize(5);
        basicDataSource.setMaxActive(10);
        return basicDataSource;
    }

    @Profile("production")//生成环境数据源
    @Bean
    public DataSource dataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean=new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/SpitterDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource) jndiObjectFactoryBean;
    }
}
