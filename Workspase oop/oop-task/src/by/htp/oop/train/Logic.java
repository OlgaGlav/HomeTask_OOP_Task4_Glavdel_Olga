package by.htp.oop.train;

import java.util.Arrays;
import java.util.Scanner;

import by.htp.oop.train.Train;

public class Logic {

	public void enterTrain(Train[] trMas) {
		Number[] trNumber = new Number[5];
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ����� ������: ");
		int enterNumber = sc.nextInt();

		for (int i = 1; i < 5; i++) {

			trNumber[i] = trMas[i].getNumber();

			if (enterNumber == (int) trNumber[i]) {

				System.out.print("����� �� ������ �������: ");
				System.out.println("����� ������ " + enterNumber + ", ����� ���������� " + trMas[i].getDestination()
						+ ", ����� ����������� " + trMas[i].getHour() + "�. " + trMas[i].getMinute() + "���.");
			}
		}

	}

	public void sortN(Train[] trMas) {
		int[] sortN = new int[5];

		for (int i = 0; i < 5; i++) {
			sortN[i] = trMas[i].getNumber();
		}

		for (int i = 0; i < 5; i++) {
			int min;
			int min_i;

			min = sortN[i];
			min_i = i;

			for (int j = i + 1; j < 5; j++) {
				if (sortN[j] < min) {
					min = sortN[j];
					min_i = j;
				}
			}

			if (i != min_i) {
				int tmp;
				tmp = sortN[i];
				sortN[i] = min;
				sortN[min_i] = tmp;
			}
		}
		System.out.println();
		System.out.println("���������� �� ������ ������:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (sortN[i] == trMas[j].getNumber()) {
					System.out.println("����� ������ " + sortN[i] + ", ����� ���������� " + trMas[j].getDestination()
							+ ", ����� ����������� " + trMas[j].getHour() + "�. " + trMas[j].getMinute() + "���.");
				}

			}

		}

	}

	public void sortD(Train[] trMas) {
		String[] sortD = new String[5];

		System.out.println();
		System.out.println("���������� �� ������ ����������: ");

		for (int i = 0; i < sortD.length; i++) {
			sortD[i] = trMas[i].getDestination();
		}

		Arrays.sort(sortD);
		for (int i = 1; i < sortD.length; i++) {

			for (int j = 0; j < 5; j++) {

				if (sortD[i] == trMas[j].getDestination()) {
					System.out.println("����� ���������� " + sortD[i] + ", ����� ������ " + trMas[j].getNumber()
							+ ", ����� ����������� " + trMas[j].getHour() + "�. " + trMas[j].getMinute() + "���.");
				}
			}
		}

	}
}
