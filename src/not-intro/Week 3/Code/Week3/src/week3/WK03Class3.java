package week3;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class WK03Class3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
try {
int numbers[] = {1,2,3};
File f = new File("D:\\CMPR 113\\Week 3\\Code\\Week3\\GoodFile.txt");
FileWriter fw =new FileWriter(f,false);
for(int i=0;i<numbers.length;i++)
{
    System.out.println(numbers[i]);//WORK ON THIS PART
    
    fw.write(Arrays.toString(numbers));
}
    fw.write("\nThe file has been found, thank you");


fw.close();
System.out.println("Recorded");

}catch(Exception ex)
{
}

}
}