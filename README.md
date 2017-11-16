# Foxy foxes and Geesey geese
Implementation of the game [Fox and Geese](https://en.wikipedia.org/wiki/Fox_games#Fox_and_Geese) in `Java` utilising the terminal. Created as a CS1002 practical to help Laura.

### Cool Game _(I guess)_ but how do I run it?
Well mon ami, you'll need to follow these steps:
> Je ne suis pas ton ami...

+ [Clone](https://github.com/VictorIJnr/CS1002-W09.git "Download the project now") the project
+ Go to the [source folder](/source) of this project 
+ Compile those bad bois with a cheeky little `javac *.java`
+ Run the [W09 file](/source/W09Practical.java) using the promiscouos `java W09Practical.java` command
+ Play the game
+ #### Pretty Standard Stuff  

  
### You do realise that you haven't told us how to play right?
No.
### ...
Well then, instructions on how to use are as follows:  
+ The game starts off as the geese's turn
+ Turns alternate after each valid move
+ The game ends when either the fox does not have any valid moves remaining, or the fox eats all the geese
+ To make a move
    + Input 4 numbers in the following order  
        1. starting X position
        2. starting Y position
        3. target X position
        4. target Y position
    + Hit enter after each number you enter, so the input `1234` would become 
        ```
            1
            2
            3
            4
        ```
+ Players can move one space in **_any_** direction
    + However, the fox can jump over any duck in it's vicinity
    
From [Master of Games](https://www.mastersofgames.com/rules/fox-geese-rules.htm)
> ### Equipment
> 
> The game of Fox & Geese is played upon a cross shaped board consisting of a 3x3 point square in the middle with four 2 x 3  point areas adjacent to each face of the central square. This makes a total of 33 points. Pieces are allowed to move from 
> one point to another only along lines which join points. Accompanying the board, there should be a single playing piece  representing the fox in black or red and 15 white playing pieces representing the geese.
> 
>  
> 
> ### Preparation and Objective
> 
> Fox & Geese is a game of inequality. The geese cannot capture the fox but aim, through the benefit of numbers, to hem the  fox in so that he cannot move. The objective of the fox, on the other hand, is to capture geese until it becomes impossible  for them to trap him. The geese start by occupying all 6 squares of one arm of the cross plus the whole first adjacent row  and the two end points of the central row. The fox starts in the middle of the board.
> 
>  
> 
> ### Basic Play
> 
> Player's toss a coin to decide who will play the fox - the geese move first. Players take turns to move a goose or the fox  to an adjacent point along a line. However, the geese are restricted to being able to move directly forwards, diagonally  forwards or sideways only.
> Upon the fox's turn, if a goose is adjacent to the fox with an empty point directly behind, the fox may capture that goose by hopping over it into the empty square and removing the smitten goose from the board.
> 
> Captured pieces are never replayed onto the board and remain captured for the remainder of the game.  The game is finished when a player loses either by being reduced to two pieces or by being unable to move.
> 
> Like all unequal games, it makes sense to play an even number of games, each player alternating between playing the fox and playing the geese. The player who wins the most games wins the match.
