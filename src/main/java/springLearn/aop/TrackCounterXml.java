package main.java.springLearn.aop;

import java.util.HashMap;
import java.util.Map;

public class TrackCounterXml {
    private Map<Integer,Integer> trackCount=new HashMap<Integer, Integer>();

    public void countTrack(int trackNumber){
        int currentcount=getPlayCount(trackNumber);
        trackCount.put(trackNumber,currentcount+1);
    }

    public int getPlayCount(int trackNumber){
        return trackCount.containsKey(trackNumber)?trackCount.get(trackNumber):0;
    }
}
