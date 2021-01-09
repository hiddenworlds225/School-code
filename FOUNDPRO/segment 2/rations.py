# 4.06 Project: Rations
# Purpose: Distribution of limited rations
# 
# Author@ Shawn Velsor
# Date: 1/8/2021

print("It's 20 years afer the outbreak of the cordyceps fungus.")
print("Humans live in walled off quarantine zones under FEDRA protection.")
print("As of now, it is time to distribute rations to the remaining populus...")
print()

rationLimit = int(input("What is the limit of rations we can give today? "))
rationsGivenPreviously = int(input("How many rations were already given? "))


def main():
    #initalize variables for code.
    rationsGiven = rationsGivenPreviously

    age = int(input("What is the person's age? "))
    rationCard = input("Does the person have a ration card? Y/N: ").upper()
    
    #Check to see if we can give rations if they are eligibe to recieve any.
    if(age < 14 or age > 65):
        print("You get a free ration pack due to age.")
        rationsGiven += 1

    elif(rationCard == "Y"):
        rationsGiven += 1
        print("You trade a ration card to recieve a ration pack.")

    else:
        print("You don't recieve a ration pack.")
    
    # quit the program since we cannot give anymore rations for the day.
    if(rationsGiven >= rationLimit ):
        print("We cannot give any more rations today. We'll give more tomorrow.")
        exit()

while True:
    main()