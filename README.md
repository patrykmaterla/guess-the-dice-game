# Guess the Dice Game
A game of guessing the drawn number.

## About
Simple CLI game made in Java. In this game, the user will guess a number from one to six. A dice will roll and the user's guess will be compared.

#### Rules
- the game master (computer) throws the dice (draws numbers from the range 1..6)
- the player (also the computer) tries to guess the number (also draws)
- if he guesses right, the game ends
- if he does not guess, the next round begins (the computer draws another number and the player tries to guess it)

## How it looks

``` batch
#####PLAYERS#####
Clu
Tron
SamFlynn
#################

-----------------
Dice Roll Result: 1
Clu: 2
Clu didn't guess the right number!
Tron: 1
Tron guessed the right number and score the point!
Enter a number (1-6):
1
SamFlynn: 1
SamFlynn guessed the right number and score the point!
```
