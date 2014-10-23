package rainbowrevenge.cards;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Vector;
import java.lang.System;

public class Card {
	/**
	 * Card class for generating cards.
	 */
	public String category;
	public long last_repet;
	public long next_repet;
	public int grade;
	public boolean not_seen;
	private String question;
	private String answer;
	public static CardList cardlookup;
	
	
	
	private static Random rand = new Random();
	
	//inits
	Card(){
	}
	
	Card(InputStreamReader in, int i){
		readCard(in, i);
	}
	
	//Methods
	public void readCard(InputStreamReader in,int i){
		
	}
	
	//Methods for setting up cards
	
	public String getQuestion(){
		return question;
	}
	public void setQuestion(String question){
		this.question = question;
	}
	
	public String getAnswer(){
		return answer;
	}
	public void setAnswer(String answer){
		this.answer = answer;
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
