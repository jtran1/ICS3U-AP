package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BayviewGlenPool {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double lengthPool, widthPool, DepthShallow, DepthDeep,lengthTransition, lengthShallow, lengthDeep, price1, price2, price3, volumePool, volumeShallow, volumeDeep, volumeT, volumeTT;
		double LinerTotal, LinerShallow, LinerDeep, LinerT, LinerTT, LinerTHyp, LinerTHypF, XLinerTHyp;
		System.out.println("What is the length of the pool?");
		lengthPool = keyboard.nextDouble();
		System.out.println("And what is the width of the pool?");
		widthPool = keyboard.nextDouble();
		System.out.println("What is the depth of the deep end?");
		DepthDeep = keyboard.nextDouble();
		System.out.println("And what is the depth of the shallow end?");
		DepthShallow = keyboard.nextDouble();
		System.out.println("How long is the transition between the deep end and shallow end?");
		lengthTransition = keyboard.nextDouble();
		System.out.println("How long is the shallow end?");
		lengthShallow = keyboard.nextDouble();
		System.out.println("And how long is the deep end?");
		lengthDeep = keyboard.nextDouble();
		System.out.println("How much is the child labor plastic liner? ");
		final double PRICE1 = keyboard.nextDouble();
		System.out.println("How much is the guicci liner?");
		final double PRICE2 = keyboard.nextDouble();
		System.out.println("How much is the liner made from Harambe's remains?");
		final double PRICE3 = keyboard.nextDouble(); 
		
		volumeShallow = (lengthShallow*widthPool*DepthShallow);
		volumeDeep = (lengthDeep*DepthDeep*widthPool);
		volumeTT = (((DepthDeep-DepthShallow)*lengthTransition)/2)*widthPool;
		volumeT = (DepthShallow*lengthTransition*widthPool);
		volumePool = (volumeShallow+volumeDeep+volumeTT+volumeT);
		
		System.out.println("The amount of water needed to keep the pool 90% full is " + volumePool*0.9 + " liters cubed");
		LinerShallow = ((lengthShallow*DepthShallow*2)+widthPool*DepthShallow);
		LinerDeep = ((lengthDeep*DepthDeep*2)+widthPool*DepthDeep);
		LinerTHyp = ((DepthDeep-DepthShallow)*(DepthDeep-DepthShallow)+(lengthTransition*lengthTransition));
		LinerTHypF =  Math.sqrt(LinerTHyp);
		XLinerTHyp = (LinerTHypF*widthPool);
		LinerTT = ((LinerTHypF*(DepthDeep-DepthShallow))/2)*2;
		LinerT = (lengthTransition*DepthShallow)*2;
		LinerTotal = LinerT+LinerTT+XLinerTHyp+LinerTHypF+LinerTHyp+LinerDeep+LinerShallow;
		
		System.out.println("You will need " + LinerTotal + "meters squared of liner");
		
		System.out.println("The liner will cost " + LinerTotal*PRICE1 + "$ with the child labor liner");
		System.out.println("The liner will cost " + LinerTotal*PRICE2 + "$ with the guicci liner");
		System.out.println("The liner will cost " + LinerTotal*PRICE3 + "$ with the harmabe liner");
	}

}
