# 6.03
# 
# Desc: Rock, paper, scissors
# 
# @Author Shawn Velsor
# @Date 3/2/2021
# #

import random

#Declare main function
def Main():
    # Get input; str to get the correct input. Took forever to find issue
    shape = str(input("Select Rock(r), Paper(p), or Scissors(s): ")).lower()

    #If given the wrong input, they forefeit.

# Set items as numbers for the rng system to be used.
    chose = 0

    if(shape == "r"):
        chose = 1
    elif(shape == "p"):
        chose = 2
    elif(shape == "s"):
        chose = 3 

# Get a random number from the generator
    ran = random.randint(1,3)

# Check if the user won the match; if no 
    if(chose == 0):
        print("You decided to forefeit the game.")
    elif((chose == 1 and ran == 3) or (chose == 2 and ran == 1) or (chose == 3 and ran == 2)):
        print("You had " + GetHand(chose) + ", and your opponet had " + GetHand(ran) + ", you win!")
    elif(chose == ran):
        print("You had " + GetHand(chose) + ", and your opponet had " + GetHand(ran) + ", you tie!")
    else:
        print("You had " + GetHand(chose) + ", and your opponet had " + GetHand(ran) + ", you lose!")
    

# Check to see if the player wants to play again    
    inp = str(input("Do you want to continue? (Y/N): ")).lower()

    if(inp == "n"):
        quit()

# Get hand for we can get the correct string for it.     
def GetHand(x):
    if(x == 1):
        return "Rock"
    elif(x == 2):
        return "Paper"
    elif(x == 3):
        return "Scissors"

#Start Main loop; print intro before loop with instructions
print("Welcome to Rock Paper Scissors!")
print("The rules: Rock beats Scissors, Paper beats Rock, Scissors beat Paper;\nif you get the same gesture, you tie!")
print()
while True:
    Main()