package users.groups;

import calendar.CalendarController;
import frontend.GUI;
import frontend.MainMenu;
import login.LogIn;
import users.students.StudentController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/** GroupMenu window is for joining, creating a group and to view current groups.*/

public class GroupMenu implements GUI {
    private JButton createGroup;
    private JButton joinGroup;
    private JButton viewGroups;
    private JFrame frame;
    private JButton homeMenu;

    private LogIn loginController;
    private GroupController groupController;
    private CalendarController calendarController;
    private StudentController studentController;
    private String studentUsername;

    /** constructor StartMenu with 5 parameters
     * @param loginController
     * @param groupController
     * @param calendarController
     * @param studentController
     * @param studentUsername
     */
    public GroupMenu(LogIn loginController, GroupController groupController, CalendarController calendarController,
                     StudentController studentController, String studentUsername) {
        setControllers(loginController, groupController, calendarController, studentController);
        this.studentUsername = studentUsername;
        this.frame = new JFrame();
        this.frame.setLayout(null);
        this.frame.setSize(500,500);
        setButtons();
        setLabelsAndText();
        this.frame.setVisible(true);
    }

    @Override
    public void setLabelsAndText() {

    }

    @Override
    public void setButtons() {
        this.joinGroup = new JButton("Join Group");
        this.joinGroup.setBounds(30,120,200,40);
        this.joinGroup.addActionListener(this);
        this.frame.add(this.joinGroup);

        this.createGroup = new JButton("Create Group");
        this.createGroup.setBounds(250,120,200,40);
        this.createGroup.addActionListener(this);
        this.frame.add(this.createGroup);

        this.viewGroups = new JButton("View Groups");
        this.viewGroups.setBounds(30,200,200,40);
        this.viewGroups.addActionListener(this);
        this.frame.add(this.viewGroups);

        this.homeMenu = new JButton("Return to Home Menu");
        this.homeMenu.setBounds(250,200,200,40);
        this.homeMenu.addActionListener(this);
        this.frame.add(this.homeMenu);
    }

    @Override
    public void setControllers(LogIn loginController, GroupController groupController, CalendarController calendarController, StudentController studentController) {
        this.loginController = loginController;
        this.groupController = groupController;
        this.calendarController = calendarController;
        this.studentController = studentController;
    }

    /** Makes button to perform based on a choice of a user.
     * @param e
     */

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewGroups) {

            this.frame.dispose();
            ViewGroups viewGroups = new ViewGroups(this.loginController, this.groupController, this.calendarController,
                    this.studentController, this.studentUsername);


        } else if (e.getSource() == this.createGroup) {

            this.frame.dispose();
            CreateGroup createGroup = new CreateGroup(this.loginController, this.groupController, this.calendarController,
                    this.studentController, this.studentUsername);


        } else if (e.getSource() == this.joinGroup){

            this.frame.dispose();
            JoinGroup joinGroup = new JoinGroup(this.loginController, this.groupController, this.calendarController,
                    this.studentController, this.studentUsername);


        } else {

            this.frame.dispose();
            MainMenu menu = new MainMenu(this.loginController, this.groupController, this.calendarController,
                    this.studentController, this.studentUsername);
           // new StartMenu()
            //add this when controller classes created


        }



    }
}
