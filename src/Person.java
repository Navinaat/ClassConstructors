
public class Person {
    String FirstName;
    String LastName;
    int Age;
    String FullName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastNumber() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean IsTeen() {
        if (Age > 12 && Age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        String S1 = FirstName + LastName;


        if (FirstName.isEmpty() && LastName.isEmpty()) {
            return " ";
        } else if (FirstName.isEmpty()) {
            return LastName;
        }
        if (LastName.isEmpty()) {
            return FirstName;
        }
        return FullName;
    }


    public static void main(String[] args) {

       {
            Person p1 = new Person();
            p1.setFirstName("Navi");
            p1.setLastName(" thamizh");
            p1.setAge(32);
            System.out.println("FullName = " + p1.getFullName());
            System.out.println("Teen = " + p1.IsTeen());

        }
    }
}

