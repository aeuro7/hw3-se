// 6510450399 Tibet Charoensripaiboon

public class User implements Verification {
    private String name;
    private Email email;
    private int age;

    // Constructor
    public User(String name, Email email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public void verify() {
        if (getName() == null || getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        System.out.println("Name not empty");
        if ( !getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
        System.out.println("Name is correct format");

        if(getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
        System.out.println("Age more than 20 years");

    }


        // Getters
        public String getName() {
            return name;
        }

        public Email getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(Email email) {
            this.email = email;
        }

        public void setAge(int age) {
            this.age = age;
        }




}