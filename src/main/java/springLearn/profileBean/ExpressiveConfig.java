package main.java.springLearn.profileBean;

import main.java.springLearn.springBean.soundsystem.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/resource/app.properties")
public class ExpressiveConfig {
    @Autowired
    private  Environment environment;

    @Bean
    public BlankDisc disc(){
        return new BlankDisc(environment.getProperty("disc.title"),environment.getProperty("disc.artist"));
    }

//    public static void main(String[] args) {
//        environment.getProperty("disc.title");
//        ExpressiveConfig expressiveConfig=new ExpressiveConfig();
//        expressiveConfig.disc();
//    }
}
