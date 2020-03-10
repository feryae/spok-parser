
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */

public class Main {
    // Main Clas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("      S-P-O-K Parser Program      ");
        System.out.println("==================================");
        System.out.println("    Please Input The Sentence :   ");
        String S = sc.nextLine();
        //Parser Calling with String.
        Parser(S);
        
    }
    
//Token Recognizer S
private static boolean SubjeRec(String a) {       
        char[] b = a.toCharArray();
        if (b.length == 3){
            if ((b[0] == 'd')||(b[0] == 'D')){
                if ((b[1] == 'i')||(b[1] == 'I')){
                    return (b[2] == 'a')||(b[2] == 'A');
                }
            }else if ((b[0] == 'i')||(b[0] == 'I')){
                if ((b[1] == 't')||(b[1] == 'T')){
                    return (b[2] == 'u')||(b[2] == 'U');
                }
            }     
        }else if (b.length == 4){
            if ((b[0] == 's')||(b[0] == 'S')){
                if ((b[1] == 'a')||(b[1] == 'A')){
                    if ((b[2] == 'y')||(b[2] == 'Y')){
                        return (b[3] == 'a')||(b[3] == 'A');
                    }
                }
            }else if ((b[0] == 'k')||(b[0] == 'K')){
                if((b[1] == 'a')||(b[1] == 'A')){
                    if ((b[2] == 'm')||(b[2] == 'M')){
                       return ((b[3] == 'u')||(b[3] == 'U'))||(b[3] == 'i')|| (b[3] == 'I');
                    }
                }
            }
        }
        return false;
 }

    private static boolean PredicRec(String a) {
        char[] b = a.toCharArray();
        if (b.length == 4){
            if ((b[0] == 'm')||(b[0] == 'M')){
                if((b [1] == 'a')||(b [1] == 'A')){
                    }else if ((b[2] == 'i')||(b[2] == 'I')){
                        return ((b[3] == 'n')||(b[3] == 'N'));            
                }
            }
        }else if (b.length == 5){
            if ((b[0] == 'm')||(b[0] == 'M')){
                if((b [1] == 'a')||(b [1] == 'A')){
                    if((b[2] == 's')||(b[2] == 'S')){
                        if((b[3] == 'a')||(b[3] == 'A')){
                            return ((b[4] == 'k')||(b[4] == 'K'));
                        }        
                    }else if ((b[2] == 'k')||(b[2] == 'K')){
                        if ((b[3] == 'a')||(b[3] == 'A')){
                            return ((b[4] == 'n')||(b[4] == 'N'));
                        }
                    }
                }else if ((b[1] == 'i')||(b[1] == 'I')){
                    if ((b[2] == 'n')||(b[2] == 'N')){
                        if ((b[3] == 'u')||(b[3] == 'U')){
                            return ((b[4] == 'm')||(b[4] == 'M'));
                        }
                    }
                }
            }else if((b[0] == 't')||(b[0] == 'T')) {
                if ((b[1] == 'i')||(b[1] == 'I')){
                    if ((b[2] == 'd')||(b[2] == 'D')){
                        if ((b[3] == 'u')||(b[3] == 'U')){
                            return ((b[4] == 'r')||(b[4] == 'R'));
                        }
                    }
                }
            }
        }
    return false;
}

    private static boolean ObjectRec(String a) {
        char[] b = a.toCharArray();
        if(b.length == 4){
            if((b[0] == 'a')||(b[0] == 'A')){
                if((b[1] == 'y')||(b[1] == 'Y')){
                    if ((b[2] == 'a')||(b[2] == 'A')){
                        return ((b[3] == 'm')||(b[3] == 'M'));
                    }
                }
            }else if ((b[0] == 'b')||(b[0] == 'B')){
                if ((b[1] == 'o')||(b[1] == 'O')){
                    if ((b[2] == 'l')||(b[2] == 'L')){
                        return ((b[3] == 'a')||(b[3] == 'A'));
                    }
                }
            }else if((b[0] == 'n')||(b[0] == 'N')){
                if ((b[1] == 'a')||(b[1] == 'A')){
                    if ((b[2] == 's')||(b[2] == 'S')){
                        return ((b[3] == 'i')||(b[3] == 'I'));
                    }
                }
            }else if ((b[0] == 'k')||(b[0] == 'K')){
                if ((b[1] == 'o')||(b[1] == 'O')){
                    if ((b[2] == 'p')||(b[2] == 'P')){
                        return ((b[3] == 'i')||(b[3] == 'I'));
                    }
                }
            }else if ((b[0] == 's')||(b[0] == 'S')){
                if ((b[1] == 'o')||(b[1] == 'O')){
                    if ((b[2] == 'd')||(b[2] == 'D')){
                        return ((b[3] == 'a')||(b[3] == 'A'));
                    }
                }
            }
        }
        return false;
    }

    private static boolean KeterRec(String a) {
        char [] b = a.toCharArray();
        if (b.length == 4){
            if ((b[0] == 'e')||(b[0] == 'E')){
                if ((b[1] == 'n')||(b[1] == 'N')){
                    if ((b[2] == 'a')||(b[2] == 'A')){
                        return ((b[3] == 'k')||(b[0] == 'K'));
                    }
                }
            }else if ((b[0] == 'b')||(b[0] == 'B')){
                if ((b[1] == 'i')||(b[1] == 'I')){
                    if ((b[2] == 'r')||(b[2] == 'R')){
                        return ((b[3] == 'u')||(b[3] == 'U'));
                    }
                }
            }
        }else if(b.length == 5){
            if ((b[0] == 'k')||(b[0] == 'K')){
                if ((b[1] == 'e')||(b[1] == 'E')){
                    if ((b[2] == 'r')||(b[2] == 'R')){
                        if ((b[3] == 'a')||(b[3] == 'A')){
                            return ((b[4] == 's')||(b[4] == 'S'));
                        }
                    }
                }
            }else if ((b[0] == 'p')||(b[0] == 'P')){
                if ((b[1] == 'a')||(b[1] == 'A')){
                    if ((b[2] == 'h')||(b[2] == 'H')){
                        if ((b[3] == 'i')||(b[3] == 'I')){
                            return ((b[4] == 't')||(b[4] == 'T'));
                        }
                    }
                }
            }else if (((b[0] == 'g')||(b[0] == 'G'))){
                if ((b[1] == 'u')||(b[1] == 'U')){
                    if ((b[2] == 'r')||(b[2] == 'R')){
                        if ((b[3] == 'i')||(b[3] == 'I')){
                            return ((b[4] == 'h')||(b[4] == 'H'));
                        }
                    }
                }
            }
        }
        return false;
    }

    private static void Parser(String a) {
        
        String[] b =  a.split(" ");
        String[] check = new String[b.length] ;
        String printSPOK = "";
        boolean outdict = false;
        for(int i=0; i<b.length; i++){
            if(SubjeRec(b[i])){
                check[i] ="S";
                printSPOK = printSPOK + "S";
            }else if (PredicRec(b[i])){
                check[i] = "P";
                printSPOK = printSPOK + "P";                
            }else if (ObjectRec(b[i])){
                check[i] ="O";
                printSPOK = printSPOK + "O";
            }else if (KeterRec(b[i])){
                printSPOK = printSPOK + "K";
                check[i] = "K";
            }else{
                i = b.length;
                outdict = true;
            }
        }
        System.out.println(Arrays.toString(check));
        if (outdict){
            System.out.println("Not From Dictionary");
        }else{
            if (check.length == 2){
            if (check[0] == "S"){
                if(check[1] == "P"){
                    System.out.println("Accepted");
                }else{
                    System.out.println("Not Accepted");
                }
            }else{
                System.out.println("Not Accepted");
            }
        }else if (check.length == 3){
            if (check[0] == "S"){
                if (check[1] == "P"){
                    if ((check[2] == "O")||(check[2] == "K")){
                        System.out.println("Accepted");
                    }else{
                        System.out.println("Not Accepted");
                    }
                }else{
                    System.out.println("Not Accepted");
                }
            }System.out.println("Not Accepted");
        }else if (check.length == 4){
            if (check[0] == "S"){
                if (check[1] == "P"){
                    if ((check[2] == "O")){
                        if(check[3] == "K"){
                            System.out.println("Accepted");
                        }else{
                            System.out.println("Not Accepted");
                        }
                    }else{
                        System.out.println("Not Accepted");
                    }
                }else{
                    System.out.println("Not Accepted");
                }
            }else{
                System.out.println("Not Accepted");
            }    
        }else{
            System.out.println("Not Accepted");
        }
        }
        
    }
    
    
    
}
