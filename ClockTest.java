// Find the error (Was missing a return type on the getter method)

class Clock {
    private String time;

    public void setTime(String t) {
        time = t;
    }

    public String getTime() {
        return time;
    }
}

class ClockTest {
    public static void main(String[] args) {

        Clock c = new Clock();
        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}