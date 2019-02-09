public class Main {
    public static void main(String[] args) {
        FeedBuzRunner feedBuzRunner = new FeedBuzRunner();
        feedBuzRunner.startRun(100, new FeedBuzRunner.CallBack() {
            @Override
            public void disstanceAchive(int count,String feed, String buzz) {
                if(feed!=null||buzz!=null)
                System.out.println((feed!=null?feed:"") +
                    (buzz!=null?buzz:""));
                else System.out.println("iteration " + count);

            }
        });
//        feedBuzRunner.startRun(1000,(feed,buzz)-> {
//            if(feed!=null||buzz!=null)
//                System.out.println((feed!=null?feed:"") +
//                    (buzz!=null?buzz:""));
//        });
    }
}
