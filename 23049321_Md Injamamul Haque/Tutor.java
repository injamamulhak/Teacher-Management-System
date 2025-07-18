class Tutor extends Teacher
{
    //
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //constructors
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary,String specialization, String academicQualifications, int performanceIndex)
    {
        super(teacherId, teacherName, address, workingType,employmentStatus);
        super.setworkingHours(workingHours);//setter method for workingHours
        
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualifications=academicQualifications;
        this.performanceIndex=performanceIndex;
        this.isCertified=false;
    }
    //accessor(getter) method
    public double getsalary()
    {
        return salary;
    }
    public String getspecialization()
    {
        return specialization;
    }
    public String getacademicQualifications()
    {
        return academicQualifications;
    }
    public int getperformanceIndex()
    {
        return performanceIndex;
    }
    public boolean isCertified()
    {
        return isCertified;
    }
    
    //method to set the newSalary and newPerformanceIndex as a parameter
    public void setSalary(double newSalary,int newPerformanceIndex)
    {
        if(newPerformanceIndex>5 && getworkingHours()>20)
        {
            double appraisal =0.0; //appraisal---->rating //
            if(newPerformanceIndex >= 5 && newPerformanceIndex <=7)
            {
                appraisal=0.05;
            }
            else if(newPerformanceIndex >= 8 && newPerformanceIndex <= 9)
            {
                appraisal=0.1;
            }
            else if(newPerformanceIndex == 10)
            {
                appraisal=0.2;
            }
            
            this.salary = newSalary + (appraisal * newSalary);
            this.isCertified = true;
        }
        else
        {
            System.out.println("The salary cannot be approved since Tutor has not been certified");
            
        }
        
    }
        //use of removeTutor method if tutor is not certified
        //setter method
        public void removeTutor(){
        if (!isCertified){
            this.salary=0.0;
            this.specialization=null; 
            this.academicQualifications=null;
            this.performanceIndex=0;
            isCertified=false;
        }
        else
        {
            System.out.println("Certified Tutor cannot be removed");
        }
            
        }
        //dispaly method
        public void displayTutorDetails()
        {
            super.displayTeacherDetails();
            if(!isCertified)   // to dispaly all the details of Tutor
            {
                System.out.println("Salary: "+getsalary());
                System.out.println("Specialization: "+getspecialization());
                System.out.println("Academic Qualification: "+getacademicQualifications());
                System.out.println("Performance Index: "+getperformanceIndex());
            }
            else
            {
                System.out.println("The Tutor has not been certified yet.");
            }
        }
        
    }
