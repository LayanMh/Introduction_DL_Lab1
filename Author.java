public class Author {

private String id ;
private String name ; 
private char gender ; 

public Author(String id, String name, char gender) {
this.id = id;
this.name = name;
this.gender = gender;
}

public String getId()
{
return id ; 
}

public String getName()
{
return name ; 
}

public char getGender()
{
return gender ; 
}

public String toString()
{
return  " id  : " + id  + " , Name : " + name +" , gender : " + gender ;
}
}
