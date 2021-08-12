package Thread;

public class SynchronizedEx {
    public static void main(String[] args) {
        SharedPrinter p = new SharedPrinter();          //공유 데이터 생성
        String [] engText = { "Wise man say,",
                                "only fools rush in"
                                ,"But I cant'help"};

        String [] kortext = { "동해물과 백두산이 마르고 닳도록,"
                                ,"하느님이 보우하사 우리나라만세",
                                "무궁화 삼천리 화려강산"};

        //스레드 생성시 공유 프린터의 주소를 알려준다. 두 스레드는 공유 프린터 p 에 동시에 접근한다.
        Thread th1 = new WorkerThread(p, engText);
        Thread th2 = new WorkerThread(p, kortext);

        th1.start(); th2.start();
    }
}

class SharedPrinter {
    synchronized void print(String text) {       //synchronized 생략시 동시접근
        // Thread.yield(); 스레드 스케쥴링. 실행시 더 많은 충돌이 발생.
        for (int i = 0; i < text.length(); i++)
            System.out.print(text.charAt(i));
        System.out.println();

    }
}
    class WorkerThread extends Thread {     //스레드 클래스
        SharedPrinter p;        //공유 프린터 주소
        String [] text;

        WorkerThread(SharedPrinter p, String[] text){
            this.p =p; this.text = text;
        }

        public void run(){
            for(int i=0; i<text.length; i++)
                p.print(text[i]);
        }
    }

