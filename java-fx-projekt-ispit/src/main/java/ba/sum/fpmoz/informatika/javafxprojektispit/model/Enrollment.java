package ba.sum.fpmoz.informatika.javafxprojektispit.model;

public class Enrollment extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int ID;

    @ForeignKey(table = "Course", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int courseFk;

    @ForeignKey(table = "User", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int studentFk;

    @ForeignKey(table = "Grade", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int gradeFk;

    @Entity(type = "VARCHAR", size = 50, isnull = false)
    String date;

    public int getID() {
        return ID;
    }

    public int getCourseFk() {
        return courseFk;
    }

    public void setCourseFk(int courseFk) {
        this.courseFk = courseFk;
    }

    public int getStudentFk() {
        return studentFk;
    }

    public void setStudentFk(int studentFk) {
        this.studentFk = studentFk;
    }

    public int getGradeFk() {
        return gradeFk;
    }

    public void setGradeFk(int gradeFk) {
        this.gradeFk = gradeFk;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}