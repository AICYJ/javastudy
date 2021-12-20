I made a fun code that can proceed based on what I learned up to 04.  
Of course, it's your first time seeing the random function, but I hope you just follow this part(random method) and create a pokemon selection program.  
First, before looking at the correct answer code, look at the below statement and see if it is possible to develop program using java code, and if not, refer to the correct answer code and develop it. 

random method{

import java.util.Random;

Random rm = new Random();
evolution=rm.nextInt(4);
}

Evolution Pokemon program.
To systematically develop program, A systematic flow of thinking is helpful.  
The first flow of thinking is to think and organize what variables will be used in this program.  
The second flow of thinking is what methods are needed.  
Finally, through imagination, we decide how to construct and flow variables and methods.   

In fact, all developers have their own style, so you don't have to have too stereotyped thinking.  
Just refer to it and accept what you need.

## 1. Check the variables to be used. 

Pokemon selection variable(mypokemon), Pokemon evolution variable(evolution).

## 2. Check which method is needed. 

In order to select a monster, a scanner method to receive input. 
A random method to set it to evolve Randomly are required.  
Conditional statements are needed to make changes according to monster selection. 
In conclusion, the Sanner method and the Random method and Conditional statements are needed. 

## 3. Decide how to construct and flow variables and methods. 

There are four steps 

1. Explain a program and how to select a monster selection. 
ex) print("Please choose the monster. (1: Pikachu 2: Squirtle 3: Charmander)") 

2. Monster choice. 
ex) if mypokemon ==1 Pikachu? and so on... we need to make 3 selection option..

3. Decide whether to evolve or not. 
ex) evolution(0~3) ==1 evolution ? (25%) 

4. Skill selection and output according to monster types and evolution. 
ex) Pikachu A million volt Raichu 10 million bolt.  we need to make 6 skill 3(Pikachu, Squirtle, Charmander)*2(evolution)
