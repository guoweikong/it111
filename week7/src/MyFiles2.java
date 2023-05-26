import java.io.File;

import static java.lang.System.out;


public class MyFiles2 {

    public static void main (String[] args) {

        File dir = new File("NewFolder");

        // start with an if else statement

        if(dir.exists()) {
            // if the directory exists, we are going to be happy!
            // this is where we are going to call out our array

            String[] files = dir.list();
                    //take the list of directories and assign it to the array.

            // a new key word, named assert
            assert files != null;
            out.println(files.length + " files found!");

            // we would like to see those files!! with a for loop
            for(int i = 0; i < files.length; i++){
                out.println(files[i]);
            }

        } else {
            // if the directory not exists, we are going to be said.
            out.println("Directory does not exits!!");
        }
    }
}
