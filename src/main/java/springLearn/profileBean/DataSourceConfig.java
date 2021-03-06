package main.java.springLearn.profileBean;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class DataSourceConfig {
	@Bean(destroyMethod="shutdown")
	@Profile("dev")
	public DataSource datasource(){
		return (DataSource) new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
	}
	
	@Bean
	@Profile("prod")
	public DataSource dataSource(){
		JndiObjectFactoryBean jndiObjectFactoryBean=new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName("jdbc/myDs");
		jndiObjectFactoryBean.setResourceRef(true);
		jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
		return (DataSource) jndiObjectFactoryBean.getObject();
	}
}
