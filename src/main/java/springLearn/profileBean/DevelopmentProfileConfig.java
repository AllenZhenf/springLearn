package main.java.springLearn.profileBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.activation.DataSource;

@Configuration
@Profile("dev")//表示只有dev profoile才激活创建
public class DevelopmentProfileConfig {
	@Bean
	public DataSource datasource(){
		return (DataSource) new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
	}
}
