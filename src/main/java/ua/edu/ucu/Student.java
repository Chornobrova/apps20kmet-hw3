package ua.edu.ucu;


class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name,
                   String surname,
                   double GPA,
                   int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ","
                + " surname=" + surname + ", "
                + "GPA=" + GPA + ", "
                + "year=" + year + '}';
    }

    public String getFullName() {

        return surname + " " + name;
    }

    public int compareTo(Student st) {

        return getSurname().compareTo(st.getSurname());
    }

    @Override
    public boolean equals(Object obj) {
        try {
            return ((Student) obj).
                    getFullName().
                    equals(getFullName());
        }
        catch (ClassCastException e) {
            return false;
        }
    }

}
