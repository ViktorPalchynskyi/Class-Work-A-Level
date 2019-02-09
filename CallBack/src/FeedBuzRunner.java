public class FeedBuzRunner {
    void startRun(int runCounter, CallBack callBack) {
        for (int i = 0; i < runCounter; i++) {
            if (i ==0)
                continue;
            String feed = null;
            String buzz = null;
            if (i % 3 == 0) feed = "feed";
            if (i % 5 == 0) buzz = "buzz";
            callBack.distanceAchive(i ,feed, buzz);


        }
    }

    public interface CallBack {
        void distanceAchive(int counter , String feed, String buzz);
    }
}
