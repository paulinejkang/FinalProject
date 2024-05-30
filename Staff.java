public class Staff extends Person {
    private String staffid;
    private int helping;
    //Constructor
    public Staff(String name, String id, String staffid){
        super(name, id);
        this.staffid = staffid;
        helping = 0;
    }
    /**
     * 
     * @return staff id
     */
    public String getStaffid(){
        return staffid;
    }
    
    /**
     * 
     * @param help number of times helped
     */
    public void setHelp(int help){
        helping = help;
    }

    @Override
    //display
    public void display(){
        System.out.println("Staff Name: " + super.getName() + " Staff ID: " + staffid + " Amount of People Helped: " + helping);
    }

}
