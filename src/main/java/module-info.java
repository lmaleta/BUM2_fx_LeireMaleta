module eus.ehu.bum2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens eus.ehu.bum2 to javafx.fxml;
    exports eus.ehu.bum2;
}