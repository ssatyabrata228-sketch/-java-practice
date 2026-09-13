public class Encapsulation {
    private String name;
    private int age;

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation student = new Encapsulation("Satyabrata", 21);
        System.out.println(student.getName());
        student.setAge(22);
        System.out.println(student.getAge());
    }
}

// Encapsulation = private data + controlled public access