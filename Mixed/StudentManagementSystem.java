import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String displayStudentInfo() {
        return "Name: " + name + " | Roll Number: " + rollNumber;
    }
}

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private JFrame frame;
    private JTextArea textArea;
    private JTextField nameField, rollNumberField;

    public static void main(String[] args) {
        new StudentManagementSystem().createGUI();
    }

    public void createGUI() {
        frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Roll Number:"));
        rollNumberField = new JTextField();
        inputPanel.add(rollNumberField);

        JButton addButton = new JButton("Add Student");
        inputPanel.add(addButton);

        JButton displayButton = new JButton("Display Students");
        inputPanel.add(displayButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (name.isEmpty() || rollNumberField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill both fields.");
                } else {
                    int rollNumber = Integer.parseInt(rollNumberField.getText());
                    addStudent(name, rollNumber);
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAllStudents();
            }
        });

        frame.setVisible(true);
    }

    public void addStudent(String name, int rollNumber) {
        System.out.println("Adding Student: " + name + " with Roll Number: " + rollNumber);  // Debugging line
        students.add(new Student(name, rollNumber));
        JOptionPane.showMessageDialog(frame, "Student added successfully!");
        nameField.setText("");
        rollNumberField.setText("");
    }

    public void displayAllStudents() {
        System.out.println("Displaying Students...");  // Debugging line
        textArea.setText(""); 
        if (students.isEmpty()) {
            textArea.append("No students to display!");
        } else {
            for (Student student : students) {
                System.out.println("Displaying: " + student.displayStudentInfo());  // Debugging line
                textArea.append(student.displayStudentInfo() + "\n");
            }
        }
    }
}
