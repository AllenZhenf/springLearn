package main.java.springLearn.profileBean;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@Profile("dev")//��ʾֻ��dev profoile����ʱ�Ŵ���
public class DevelopmentProfileConfig {
	@Bean(destroyMethod="shutdown")
	public DataSource datasource(){
		return (DataSource) new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
	}
}
