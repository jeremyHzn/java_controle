module Controle.game {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens Controle.game to javafx.fxml;

    exports Controle.game;
}