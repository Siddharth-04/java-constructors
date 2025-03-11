class Student {
    protected String name = "Siddharth";
    public String rollNumber;
    private double cgpa;

    public void modifyCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostGraduateStudent extends Student {
    public static void main(String[] args) {
        PostGraduateStudent student1 = new PostGraduateStudent();
        System.out.println("Student1 name: " + student1.name);
    }
}

//Student1 name: Siddharth