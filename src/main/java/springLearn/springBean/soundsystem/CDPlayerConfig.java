package main.java.springLearn.springBean.soundsystem;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//���ɨ��
//@ComponentScan(basePackages="soundsystem")//���basePackages={"",""}
@ComponentScan(basePackageClasses={CompactDisc.class})
public class CDPlayerConfig {

}
