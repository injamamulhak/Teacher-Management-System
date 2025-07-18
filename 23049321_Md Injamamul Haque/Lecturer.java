public class Lecturer extends Teacher
    {
    //additional attributes for subclass lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //constructors//
    public Lecturer(int teacherId, String teacherName, String address, String workingType, int workingHours, String employmentStatus, String department, int yearsOfExperience)
    {
        //super class constructors
        super(teacherId, teacherName, address, workingType, employmentStatus);
        //call for WorkingHours
        super.setworkingHours(workingHours); 
        
        
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }
    //  getter method(accessor) //
    public String getdepartment()
    {
        return department;
    }
    public int getyearsOfExperience()
    {
        return yearsOfExperience;
    }
    public int getgradedScore()
    {
        return gradedScore;
    }
    public void setgradedScore(int gradedScore)//setter method for gradedScore 
    {
        this.gradedScore = gradedScore;
    }
    public boolean gethasGraded()
    {
        return hasGraded;
    }
    //Method for grade assignments of students//
    public void gradeAssignment(int score, String department, int yearsOfExperience)
    {
        if(!hasGraded && yearsOfExperience >=5 && department.equals(department))
        {
            if (score >= 70 && score <=100)//taking 'A' as full score or 100
            {
                gradedScore = 70;
            }
            else if (score >= 60)
            {
                gradedScore = 60;
            }
            else if (score >= 50)
            {
                gradedScore = 50;
            }
            else if (score >= 40)
            {
                gradedScore = 40;
            }
            else
            {
                gradedScore=0;
            }
            hasGraded = true;
            this.gradedScore=score;
            System.out.println("Assignment has been graded successfully");
        }
        else
        {
            System.out.println("Assignment hasn't been graded yet ");
        }
    }
        //@Override
     public void displayLecturerDetails()
     {
        super.displayTeacherDetails();
        System.out.println("Department: "+getdepartment());
        System.out.println("Years Of Experience:" +getyearsOfExperience());
        if(hasGraded)
        {
            System.out.println("Graded Score: "+getgradedScore());    
        }
        else
        {
            System.out.println("Score has not been graded yet");
        }
     }
    }
    
    
    

