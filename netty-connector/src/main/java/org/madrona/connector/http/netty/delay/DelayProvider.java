package org.madrona.connector.http.netty.delay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DelayProvider {

    private List<Integer> delayPatternIntList = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 6, 2, 3, 1, 2, 25, 1, 2, 3, 4, 5));

    private int currentIndex = 0;

    private static DelayProvider instance;

    public static synchronized DelayProvider getInstance() {
        if (instance == null) {
            instance = new DelayProvider();
        }
        return instance;
    }

    public synchronized int nextDelay() {
        if (currentIndex < delayPatternIntList.size() - 1) {
            currentIndex++;
        } else {
            currentIndex = 0;
        }
        return delayPatternIntList.get(currentIndex);
    }
} 