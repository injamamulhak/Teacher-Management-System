public class Teacher
{
    //Declaring attributes of Teacher// 
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours; 
    
    //Constructor//
                   //Initializing the Teacher with the parameter values//
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    //Getter(accessor) Method//
    
    public int getteacherId()
    {
        return teacherId;
    }
    public String getteacherName()
    {
        return teacherName;
    }
    public String getaddress()
    {
        return address;
    }
    public String getworkingType()
    {
        return workingType;
    }
    public String getemploymentStatus()
    {
        return employmentStatus;
    }
     public int getworkingHours()
    {
        return workingHours;
    }
    
    //Setter Method for Teacher WorkingHours//
    public void setworkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }
    
    //Display Method//
    public void displayTeacherDetails()
    {
        System.out.println("Teacher ID: "+getteacherId());
        System.out.println("Teacher Name: "+getteacherName());
        System.out.println("address: "+getaddress());
        System.out.println("Working Type: "+getworkingType());
        System.out.println("Employment Status: "+getemploymentStatus());
        if(workingHours <= 0)
        {
           System.out.println("Working Hours: Not assigned ");
        }
        else
        {
             System.out.println("Working Hours: " +workingHours);
        }
        
    }
}
        
                
