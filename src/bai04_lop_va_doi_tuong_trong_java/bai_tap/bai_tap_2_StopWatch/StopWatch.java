package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_2_StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public void start() {
        starTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime-starTime;
    }
}
