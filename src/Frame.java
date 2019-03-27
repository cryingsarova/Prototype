import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame extends JFrame {

    static ArrayList<Button> buttons = new ArrayList<>();

    public void create(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setSize(200,180);
        JPanel panel = new JPanel();

        Button btn1 = new Button("1",Color.LIGHT_GRAY);
        buttons.add(btn1);

        Button btn2 = (Button) btn1.cloneObject();
        btn2.setTextNew("2");
        buttons.add(btn2);

        Button btn3 = (Button) btn1.cloneObject();
        btn3.setTextNew("3");
        buttons.add(btn3);

        Button btn4 = (Button) btn1.cloneObject();
        btn4.setTextNew("4");
        buttons.add(btn4);

        Button btn5 = (Button) btn1.cloneObject();
        btn5.setTextNew("5");
        buttons.add(btn5);

        Button btn6 = (Button) btn1.cloneObject();
        btn6.setTextNew("6");
        buttons.add(btn6);

        Button btn7 = (Button) btn1.cloneObject();
        btn7.setTextNew("7");
        buttons.add(btn7);

        Button btn8 = (Button) btn1.cloneObject();
        btn8.setTextNew("8");
        buttons.add(btn8);

        Button btn9 = (Button) btn1.cloneObject();
        btn9.setTextNew("9");
        buttons.add(btn9);

        Button btn0 = (Button) btn1.cloneObject();
        btn0.setTextNew("0");
        buttons.add(btn0);

        for (Button button:buttons) {
            panel.add(button.getButton());
        }
        TextArea textField = new TextArea("",1,15,1);
        //textArea.setSize(100,20);
        panel.add(textField,BorderLayout.SOUTH);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tmpString = String.valueOf(textField.getText()) + ((JButton)e.getSource()).getText();
                textField.setText(tmpString);

            }
        };

        for(Button button: buttons){
            button.getButton().addActionListener(listener);
        }
        add(panel);
        setVisible(true);

    }
}
