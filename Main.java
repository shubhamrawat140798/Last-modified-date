/*
Java program to get the last modified time of a file.
*/
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class GetLastModifiedTime {
    public static void main(String... args){
        File file = new File("Test.txt");
        long time = file.lastModified();
        DateFormat sdf
                = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("modified date is : "
                + sdf.format(time));
    }

}
