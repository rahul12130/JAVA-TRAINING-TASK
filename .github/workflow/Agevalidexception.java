

class Agevalidexceptionn extends Exception {
    Agevalidexceptionn(String s) {
        super(s);
    }

}
public class Agevalidexception {
        public static void main(String[] args) {
    try {
        int age=20;
        if(age<18) {
            throw new Agevalidexceptionn("your minor");
    }
        else {
            System.out.println("your major");
        }
        System.out.println();
    }
    catch (Exception e) {
        System.out.println(e);
    }
  }
}
