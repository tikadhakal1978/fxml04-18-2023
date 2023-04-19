module dhakal.sumcalculation1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens dhakal.sumcalculation1 to javafx.fxml;
    exports dhakal.sumcalculation1;
}
