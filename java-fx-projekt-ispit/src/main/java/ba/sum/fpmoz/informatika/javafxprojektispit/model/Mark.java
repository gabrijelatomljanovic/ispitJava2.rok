package ba.sum.fpmoz.informatika.javafxprojektispit.model;

public class Mark extends Table {
    @Entity(type = "INTEGER", size = 32, primary = true)
    int ID;

    @ForeignKey(table = "Hour", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int hourFk;

    @ForeignKey(table = "User", attribute = "ID")
    @Entity(type = "INTEGER", size = 32)
    int studentFk;

    @Entity(type = "INTEGER", size = 10, isnull = false)
    int mark;

    public int getID() {
        return ID;
    }

    public int getHourFk() {
        return hourFk;
    }

    public void setHourFk(int hourFk) {
        this.hourFk = hourFk;
    }

    public int getStudentFk() {
        return studentFk;
    }

    public void setStudentFk(int studentFk) {
        this.studentFk = studentFk;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
