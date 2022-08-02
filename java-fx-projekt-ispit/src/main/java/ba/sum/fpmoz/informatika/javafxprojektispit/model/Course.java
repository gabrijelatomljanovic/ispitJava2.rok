package ba.sum.fpmoz.informatika.javafxprojektispit.model;

public class Course extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int ID;
    @Entity(type ="VARCHAR", size = 50, isnull = false)
    String name;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
