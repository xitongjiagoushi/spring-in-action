package com.brctl.spring.inaction.chapter4.disc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Track Play Counter<br/>
 * {@link com.brctl.spring.inaction.chapter2.CompactDisc}, {@link com.brctl.spring.inaction.chapter2.SgtPeppers}
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@Aspect
public class TrackPlayCounter {

    // store track counter
    private Map<Integer, Integer> trackCounters = new HashMap<>();


    @Pointcut("execution(* com.brctl.spring.inaction.chapter2.SgtPeppers.playTrack(int))" +
            "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {}


    @Around("trackPlayed(trackNumber)")
    public void countTrackPlayTimes(ProceedingJoinPoint pjp, int trackNumber) {
        try {
            // accumulate track play times
            trackCounters.put(trackNumber, getTrackCount(trackNumber) + 1);
            pjp.proceed();
        } catch (Throwable e) {
            System.out.println("track count error");
        }
    }


    /**
     * get CURRENT track number
     * @param trackNumber
     * @return
     */
    public Integer getTrackCount(int trackNumber) {
        return trackCounters.containsKey(trackNumber) ? trackCounters.get(trackNumber) : 0;
    }

}
