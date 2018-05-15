package main.java.springLearn.aop;

import main.java.springLearn.springBean.soundsystem.BlankDisc;
import main.java.springLearn.springBean.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;


@EnableAspectJAutoProxy //启用自动代理功能
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeggers(){
        System.out.println("111111111");
        BlankDisc cd=new BlankDisc();
        cd.setArtist("The Beatles");
        cd.setTitle("Sgt Pepper's Lonely Hearts Club Band");
        List<String> tacks=new ArrayList<String>();
        tacks.add("Sgt Pepper's Lonely Hearts Club Band");
        tacks.add("With  a Little Help From My Friends");
        tacks.add("Lucy in the sky with Diamonds");
        tacks.add("Getting Better");
        tacks.add("Fixing a Hole");
        cd.setTracks(tacks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        System.out.println(22222);
        return new TrackCounter();
    }
}
