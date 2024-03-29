module com.jackgharris.cosc2288.a2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.xerial.sqlitejdbc;
    requires java.sql;
    requires commons.validator;
    requires junit;

    exports com.jackgharris.cosc2288.a2.core;
    exports com.jackgharris.cosc2288.a2.models;
    exports com.jackgharris.cosc2288.a2.controllers.components;
    exports com.jackgharris.cosc2288.a2.tests;

    opens com.jackgharris.cosc2288.a2.core to javafx.fxml;
    opens com.jackgharris.cosc2288.a2.controllers.components to javafx.fxml;
    opens com.jackgharris.cosc2288.a2.models to javafx.base, javafx.fxml;
    exports com.jackgharris.cosc2288.a2.controllers.settings;
    opens com.jackgharris.cosc2288.a2.controllers.settings to javafx.fxml;
    exports com.jackgharris.cosc2288.a2.controllers.stages;
    opens com.jackgharris.cosc2288.a2.controllers.stages to javafx.fxml;
}