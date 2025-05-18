class Student{
  private String name;
  private int age;
    private String major;

  public Student(String name, String major, int age){
    this.name = name;
    this.major = major;
    this.age = age;
  }

  public String getMajor(){
    return major;
  }

   public int getAge(){
    return age;
  }

  @Override
   public String toString(){
    return "Student{name:'"+name"', age:'"+age"', major:'"+major"'}";
  }

  public static void main(String[] args){
    Student student = new Student("John Doe","Software Engineering", 23);
    System.out.println(student);
  }
   
}
