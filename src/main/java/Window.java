import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    //создание конструктора Window
    public Window() {

        setTitle("Chat window");//Задаем имя окну
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//задаем "закрыть и выйти"
        setBounds(400, 400, 500, 500);//размеры создаваемого окна

//создаем основной контейнер
        JPanel jPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        jPanel.setLayout(borderLayout);
        add(jPanel);//добавлем контейнер

//создаем вложенный контейнер
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);//задем цвет
        panel.setLayout(null);//отключаем компановщик для того, чтобы расставить элементы вручную
        jPanel.add(panel, BorderLayout.CENTER);//добавляем контейнер

//создаем поле ввода текста
        JTextField jTextField_input = new JTextField("Введите ваше сообщение");
        jTextField_input.setBounds(20, 400, 340, 30);
        panel.add(jTextField_input);//добавляем поле

//создаем поле отображения сообщения
        JTextField jTextField_message = new JTextField();
        jTextField_message.setBounds(20, 20, 460, 360);
        panel.add(jTextField_message);//добавляем поле
        Font font = new Font("Arial", Font.BOLD, 25);//создаем размер шрифта для поля отображения
        jTextField_message.setFont(font);
        jTextField_message.setEditable(false);//делаем поле нередактируемым для пользователя

//создаем кнопку отправки сообщения
        JButton button_send = new JButton("Send");
        button_send.setBounds(380, 400, 90, 30);
        panel.add(button_send);
        setVisible(true);

//добавляем слушатель на кнопку отправки для отслеживания и реагирования на события
        button_send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField_input.getText();
                jTextField_message.setText(text);
                if (!text.isEmpty()) {
                    jTextField_input.setText("");
                }
            }
        });
    }
}










