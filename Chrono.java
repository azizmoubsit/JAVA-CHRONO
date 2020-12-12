class Chrono extends Thread {
    @Override
    public void run() {
        int S,M,H;
        S = M = H =0;
        String seconds;
        String minutes;
        String heures;
        while (true){
            if(S > 59){
                S=0;
                M++;
            }
            if(M > 59){
                M=0;
                H++;
            }
            seconds = Integer.toString(S);
            minutes = Integer.toString(M);
            heures = Integer.toString(H);
            if (seconds.length() < 2) {
                seconds = "0" + seconds;
            }
            if (minutes.length() < 2) {
                minutes = "0" + minutes;
            }
            if (heures.length() < 2) {
                heures = "0" + heures;
            }
            String chrono = heures + ":" + minutes + ":" + seconds;
            System.out.println(chrono);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.getStackTrace();
            }
            S++;
        }
    }
    
    // petit programme pour tester la classe
    public static void main(String[] args){
        Chrono chrono1 = new Chrono();
        Chrono chrono2 = new Chrono();
        Chrono chrono3 = new Chrono();
        chrono1.start();
        chrono2.start();
        chrono3.start();
    }
}
