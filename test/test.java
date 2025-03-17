package test;


public class test {
    int hei = 1;

    public int gethei(){
        return hei;
    }
    public static void main(String[] args) {
        test taper = new test();
        
        System.out.println(taper.gethei());
    }
}
