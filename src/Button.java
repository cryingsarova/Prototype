import javax.swing.*;
import java.awt.*;

public class Button implements Prototype {


    private String text;
    private Color color;
    private JButton button;

    public Button(String text, Color color) {

        this.text = text;
        this.color = color;
        button = new JButton(text);
        button.setBackground(color);

    }

    public void setTextNew(String text) {
        this.text = text;
        button.setText(text);
    }

    public JButton getButton(){
        return button;
    }

    @Override
    public Prototype cloneObject() {
        return new Button(this.text, this.color);
    }
}
