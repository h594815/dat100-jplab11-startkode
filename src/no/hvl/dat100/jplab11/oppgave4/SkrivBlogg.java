package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.*;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg extends Blogg {
	

    public static boolean skriv(Blogg samling, String mappe, String filnavn){

      boolean skrevet = false;
      PrintWriter writer = null;
      
      try {
    	  writer = new PrintWriter(mappe + "/" + filnavn);
    	  writer.print(samling.toString());
      }
      catch(FileNotFoundException e) {
    	  System.out.println("Det har oppstått en feil");
    	  skrevet = false;
      }
      finally {
    	  if(writer != null) {
    		  writer.close();
    		  skrevet = true;
    	  }
      }
      return skrevet;

    }
}