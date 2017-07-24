#swear word remover
Replace English,Marathi and Hindi Swear words from given string input

`package abusiveworddetector;

import com.twigsoftwares.swearwords.SwearWordRemover;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL2
 */
public class AbusiveWordDetector {

  
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String replacedWord;

        System.out.print("Pleas Enter Your Language:\n 1.Marathi\n 2.Hindi\n 3.English ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br1.readLine();
        int language = Integer.parseInt(s1);

        System.out.print("Pleas Enter Your Text With Abusive Word : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String swearwords = br.readLine();

        SwearWordRemover swr = new SwearWordRemover();
        replacedWord = swr.handleText(swearwords, language);
        System.out.println(replacedWord);
    }

   

}
`
