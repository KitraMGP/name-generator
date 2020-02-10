package com.github.zi_jing.namegenerator;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
	
	private static char[] chars = {};
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		int count;
		System.out.print("Initializating...\n");
		chars = "_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
		System.out.print("Welcome to the name generator!\nUse this application to name your classes, methods and fields.\n");
		Scanner scanner = new Scanner(System.in);
			System.out.print("How many names do you want to generate?");
			try {
			count = scanner.nextInt();
			} catch(Exception e) {
				System.out.println("Input must be a integer.");
				scanner.close();
				return;
			}
			for(int i = 0; i < count; i++) {
				System.out.println(generate());
			}
		scanner.close();
	}
	
	private static String generate() {
		String str = "";
		int length = rand.nextInt(32) + 1;
		for(int i = 0; i < length; i++) {
			str += chars[rand.nextInt(chars.length)];
		}
		return str;
	}
}
