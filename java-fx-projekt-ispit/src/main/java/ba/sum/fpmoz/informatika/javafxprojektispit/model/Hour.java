package ba.sum.fpmoz.informatika.javafxprojektispit.model;

import java.sql.Date;

public class Hour extends Table {
    @Entity(type = "INTEGER", size = 32, primary = true)
    int ID;

    @ForeignKey(table = "Course", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int courseFk;

    @ForeignKey(table = "User", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int teacherFk;

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

    public int getTeacherFk() {
        return teacherFk;
    }

    public void setTeacherFk(int teacherFk) {
        this.teacherFk = teacherFk;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}