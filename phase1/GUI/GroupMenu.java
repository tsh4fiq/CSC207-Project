import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GroupMenu implements ActionListener {
    private JButton createGroup;
    private JButton joinGroup;
    private JButton viewGroups;
    private JFrame frame;
    private JButton homeMenu;

    // need username as a paramater for constructor
    public GroupMenu() {

        this.frame = new JFrame();
        this.frame.setLayout(null);
        this.frame.setSize(1000,1000);
        this.createGroup = new JButton("Create Group");
        this.createGroup.setBounds(10,80,200,25);
        this.createGroup.addActionListener(this);
        this.frame.add(this.createGroup);
        this.joinGroup = new JButton("Join Group");
        this.joinGroup.setBounds(300,80,200,25);
        this.joinGroup.addActionListener(this);
        this.frame.add(this.joinGroup);
        this.viewGroups = new JButton("View Groups");
        this.viewGroups.setBounds(600,80,200,25);
        this.viewGroups.addActionListener(this);
        this.frame.add(this.viewGroups);

        this.homeMenu = new JButton("Return to Home Menu");
        this.homeMenu.setBounds(300,280,200,25);
        this.homeMenu.addActionListener(this);
        this.frame.add(this.homeMenu);
        this.frame.setVisible(true);

    }

    public static void main(String[] args) {
        GroupMenu menu = new GroupMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewGroups) {

            this.frame.dispose();
            ViewGroups viewGroups = new ViewGroups();


        } else if (e.getSource() == this.createGroup) {

            this.frame.dispose();
            CreateGroup createGroup = new CreateGroup();



        } else if (e.getSource() == this.joinGroup){

            this.frame.dispose();
            JoinGroup joinGroup = new JoinGroup();




        } else {

            this.frame.dispose();
           // new StartMenu()
            //add this when controller classes created




        }



    }
}