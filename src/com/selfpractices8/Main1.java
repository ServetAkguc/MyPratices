package com.selfpractices8;

class Main1 {
	  String breed, name, color;
	  int age;

		public static void main(String[] args) {
			Main1 dog1 = new Main1();
			dog1.breed="Husky";
			dog1.name="Hatiko";
			dog1.color="Grey";
			dog1.age=3;
			
			dog1.bark();
			dog1.run();
			dog1.play();
			
			Main1 dog2 = new Main1();
			dog2.breed="Bulldog";
			dog2.name="Bobby";
			dog2.color="White";
			dog2.age=4;
			
			dog2.bark();
			dog2.run();
			dog2.play();
			
			Main1 dog3 = new Main1();
			dog3.breed="Labrador";
			dog3.name="Sharik";
			dog3.color="Black";
			dog3.age=5;
			
			dog3.bark();
			dog3.run();
			dog3.play();
		}
		void bark() {
			System.out.println(color+" "+breed+" " +name +" "+ age+" years old can bark");
		}

		void run() {
			System.out.println(color+" "+breed+" " +name +" "+ age+" years old can run");
		}

		void play() {
			System.out.println(color+" "+breed+" " +name +" "+ age+" years old can play");
		}
	}