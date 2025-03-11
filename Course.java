class Course {
    String courseName;
    int duration; // Duration in months
    double fee;
    static String instituteName = "Chitkara University";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rupees" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }

    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 1500);
        Course c2 = new Course("Web Development", 4, 2000);

        System.out.println("Before Institute Name Update:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating Institute Name
        updateInstituteName("LPU University");

        System.out.println("After Institute Name Update:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
