package main.java.springLearn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {
    private Map<Integer,Integer> trackCount=new HashMap<Integer, Integer>();

    @Pointcut("execution(* main.java.springLearn.springBean.soundsystem.BlankDisc.playTrack(..))&&args(trackNumber)")
    public void trackplayed(int trackNumber){}

    @Before("trackplayed(trackNumber)")
    public void countTrack(int trackNumber){
        System.out.println("track");
        int currentcount=getPlayCount(trackNumber);
        trackCount.put(trackNumber,currentcount+1);
    }

    public int getPlayCount(int trackNumber){
        return trackCount.containsKey(trackNumber)?trackCount.get(trackNumber):0;
    }
}
