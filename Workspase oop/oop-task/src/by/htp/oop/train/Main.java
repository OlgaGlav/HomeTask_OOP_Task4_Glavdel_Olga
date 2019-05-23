package by.htp.oop.train;

import by.htp.oop.train.Logic;

import java.util.Arrays;
import java.util.Scanner;
import by.htp.oop.train.Train;

public class Main {

	public static void main(String[] args) {

		Train[] trMas = new Train[5];

		trMas[0] = new Train(150, "Гомель", 23, 15);
		trMas[1] = new Train(116, "Волковыск", 15, 43);
		trMas[2] = new Train(96, "Светлогорск", 00, 27);
		trMas[3] = new Train(630, "Калинковичи", 10, 33);
		trMas[4] = new Train(705, "Волковыск", 23, 22);

		Logic newEnterTrain = new Logic();
		
		newEnterTrain.enterTrain(trMas);
		newEnterTrain.sortN(trMas);
		newEnterTrain.sortD(trMas);

	}

//	public static void sortD(Train[] trMas) {
//		String[] sortD = new String[5];
//		for (int i = 0; i < sortD.length; i++) {
//			sortD[i] = trMas[i].getDestination();
//		}
//		Arrays.sort(sortD);
//		for (int i = 1; i <sortD.length; i++) {
////			System.out.println("Меняем : i ="+i);
//		
//			for (int j = 0; j < 5; j++) {
////				System.out.println("Меняем : j ="+j+ "  i = "+i);
//				
//				if (sortD[i] == trMas[j].getDestination()) {
////			
//					System.out.println("Пункт назначения " + sortD[i] + ", номер поезда " + trMas[j].getNumber()
//							+ ", время отправления " + trMas[j].getHour() + "ч. " + trMas[j].getMinute() + "мин.");
//					
////					break;
//				}}
//			}
//
//		}

	}


