package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteLedige;
	
	

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteLedige = 0;
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {


		int pos = 0;
		boolean funnet = false;
		while(pos < nesteLedige && !funnet) {
			if(innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}else {
				pos++;
				
			}
		}
		if(funnet) {
			return pos;
		}
		else {
			return -1;
		}
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while(pos < nesteLedige && !funnet) {
			if(innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}
			else {
				pos++;
			}
		}
return funnet;
		
	}

	public boolean ledigPlass() {
		
		 return nesteLedige < innleggtabell.length;
	}
 
	public boolean leggTil(Innlegg innlegg) {

		boolean lagtTil = false;
		
			if(!finnes(innlegg)&&ledigPlass()) {
				innleggtabell[nesteLedige] = innlegg;
				lagtTil=true;
				nesteLedige++;
			}
			return lagtTil; 
	}
	
	public String toString() {
		String print = nesteLedige + "\n";
		
		for(int i =0; i <nesteLedige;i++) {
			print += innleggtabell[i].toString();
		}
		return print;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
		
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}