module Controle.game {
    requires javafx.controls;
    requires javafx.fxml;

    opens Controle.game to javafx.fxml;
    exports Controle.game;
}