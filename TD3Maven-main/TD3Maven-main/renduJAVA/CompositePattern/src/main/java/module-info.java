module fr.univ_montpellier.iut.TD3MavenEtud {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens etud to javafx.fxml;
    exports etud;
}