package main.java.springLearn.aop;

import main.java.springLearn.springBean.soundsystem.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterConfigTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void trackCounter() throws Exception {
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
//        cd.playTrack(3);
//        cd.playTrack(3);
        cd.playTrack(4);
        cd.playTrack(4);
        cd.playTrack(4);
        Assert.assertEquals(1,trackCounter.getPlayCount(1));
        Assert.assertEquals(1,trackCounter.getPlayCount(2));
        Assert.assertEquals(4,trackCounter.getPlayCount(3));
        Assert.assertEquals(3,trackCounter.getPlayCount(4));
        Assert.assertEquals(0,trackCounter.getPlayCount(5));
        Assert.assertEquals(0,trackCounter.getPlayCount(6));
        Assert.assertEquals(0,trackCounter.getPlayCount(7));
    }

}