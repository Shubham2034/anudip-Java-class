package com.lab;

class Sports {
	    public void play() {
	        System.out.println("Playing a sport...\n");
	    }
	}
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball...");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby...");
    }
}
public class SportEx {
	 public static void main(String[] args) {
		        Sports sports = new Sports();
		        Football football = new Football();
		        Basketball basketball = new Basketball();
		        Rugby rugby = new Rugby();

		        sports.play();
		        football.play();
		        basketball.play();
		        rugby.play();
		    
		
	}

}
