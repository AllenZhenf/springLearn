package main.java.springLearn.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.jndi.JndiObjectFactoryBean;

public class JdbcExample {
    @Bean
    public JndiObjectFactoryBean dataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean=new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("/jdbc/SpitterDs");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
        return jndiObjectFactoryBean;
    }
}
