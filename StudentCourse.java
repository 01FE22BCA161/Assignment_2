class StudentCourse {
    private String[] courses = { "C#", "Software Testing ", "Machine Learning", "DEVOPS", "Minor Project" };
    private int[] marks = { 89, 90, 95, 98, 96 };

    public void displayStudentcourses() {

        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + "\t\t\t");
        }
    }
    public void displayStudentMarks() {

            System.out.println("Courses and  Marks Obtained");

            for (int i = 0; i < courses.length; i++) {
                System.out.println(courses[i] + " :  " + marks[i]);
            }
        }
    }
