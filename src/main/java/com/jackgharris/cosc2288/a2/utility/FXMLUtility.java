package com.jackgharris.cosc2288.a2.utility;

import com.jackgharris.cosc2288.a2.core.MyHealth;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class FXMLUtility {

    public static URL loginFXML = MyHealth.class.getResource("login.fxml");
    public static URL registrationFXML = MyHealth.class.getResource("registration.fxml");

    public static URL dashboardFXML = MyHealth.class.getResource("dashboard.fxml");

    public static URL settingsFXML = MyHealth.class.getResource("settings.fxml");

    public static URL terminalFXML = MyHealth.class.getResource("terminal.fxml");
    public static URL themeSettingsFXML = MyHealth.class.getResource("themeSettings.fxml");

    public static URL deleteRecordPopup = MyHealth.class.getResource("deleteRecordPopup.fxml");

    public static URL editRecordPopup = MyHealth.class.getResource("editRecordPopup.fxml");

    public static URL menu = MyHealth.class.getResource("components/menu.fxml");

    public static URL recordOverview = MyHealth.class.getResource("components/record.fxml");

    public static Scene loadScene(URL sceneURL, Stage stage, String css) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(sceneURL);

        Scene scene =  new Scene(fxmlLoader.load());

        scene.setFill(Color.TRANSPARENT);
        scene.getStylesheets().add(css);

        scene.setOnMousePressed(pressEvent ->{
            scene.setOnMouseDragged(dragEvent ->{
                stage.setX(dragEvent.getScreenX() - pressEvent.getSceneX());
                stage.setY(dragEvent.getScreenY() - pressEvent.getSceneY());
            });
        });

        return scene;
    }

}
