module ba.sum.fpmoz.informatika.javafxprojektispit {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.kordamp.bootstrapfx.core;

    opens ba.sum.fpmoz.informatika.javafxprojektispit to javafx.fxml;
    opens ba.sum.fpmoz.informatika.javafxprojektispit.model to javafx.fxml;
    exports ba.sum.fpmoz.informatika.javafxprojektispit;
    exports ba.sum.fpmoz.informatika.javafxprojektispit.controller;
    exports ba.sum.fpmoz.informatika.javafxprojektispit.model;
    opens ba.sum.fpmoz.informatika.javafxprojektispit.controller to javafx.fxml;

}