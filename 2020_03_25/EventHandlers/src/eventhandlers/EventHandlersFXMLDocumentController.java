package eventhandlers;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class EventHandlersFXMLDocumentController implements Initializable {

    @FXML
    private Label amountLabel, interestLabel, termLabel, paymentLabel;
    
    @FXML
    private TextField amountTextField, paymentsTextField;

    @FXML
    private Slider interestRateSlider;
    
    @FXML
    private ChoiceBox termsChoice;
    
    private void updateInterestLabel()
    {
        interestLabel.setText( String.format("Interest %.2f%%", interestRateSlider.getValue() ) );
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        updateInterestLabel();
        
        interestRateSlider.valueProperty().addListener(
            new ChangeListener<Number>()
            {
                @Override
                public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue)
                {
                    updateInterestLabel();
                    //System.err.printf("oldValue=%f, newValue=%f\n", oldValue.floatValue(), newValue.floatValue());
                }
            });
        
        amountTextField.focusedProperty().addListener(
            new ChangeListener<Boolean>() 
            {
            
                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if ( newValue )
                {
                    
                }
                else
                {
                    try
                    {
                        BigDecimal amount = new BigDecimal( amountTextField.getText() );
                    }
                    catch(NumberFormatException ex)
                    {
                        amountTextField.setText("Enter amount");
                        amountTextField.selectAll();
                        amountTextField.requestFocus();
                    }
                }
            }
        }
        );
    }    
    
}
