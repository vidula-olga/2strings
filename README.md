//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class Rextester
{  
   public static int substring (String where, String what) {

int i = where.indexOf(what);
int count = 0;
while (i>=0){
count++;
i=where.indexOf(what,i+1);
}
return count;
}

public static void main(String [] args) {
String where ="testtesttest ";
String what ="test";
System.out.println(substring(where,what));
}
}
