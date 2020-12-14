
# Random is used to help generate the password
import random

# Settings global variables
passwordLength = 0
pwlength = 0

# Opening and clearing the password file so old passwords are not mixed in with new ones
passwords = open("passwords.txt", "w+")
passwords.flush()

# Controls the loop
looping = True

# When The function is called, it asks for the option number and the length of the password
def GeneratePassword(num, length):
    # Clears all needed variables
    password = ""
    randNum = 0
    pwlength = 0

    # Only produces lowercase numbers
    if(num == 1):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if(randNum >= 97 and randNum <= 122):
                password += chr(randNum)
                pwlength += 1
    # Produces uppercase numbers
    if(num == 2):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if(randNum >= 65 and randNum <= 90):
                password += chr(randNum)
                pwlength += 1
    # Produces only numbers
    if(num == 3):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if(randNum >= 48 and randNum <= 57):
                password += chr(randNum)
                pwlength += 1
    # Generates a password containing Uppercase, lowercase, and numerical letters
    if(num == 4):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if((randNum >= 97 and randNum <= 122) or (randNum >= 65 and randNum <= 90) or (randNum >= 48 and randNum <= 57)):
                password += chr(randNum)
                pwlength += 1
    # Generates the previous with special characters
    if(num == 5):
        while (pwlength < length):
            randNum = random.randint(33, 126)
            password += chr(randNum)
            pwlength += 1

    # Writes password to open file
    passwords.writelines(password + "\n")

# Welcome message
print("Welcome to the PasswordGenerator\u2122!")

# Main loop
while looping:
    # Spacing with options printed
    print()
    print("Please select an option:",
    "\n [1]Only lowercase Numbers",
    "\n [2]Only Uppercase Numbers",
    "\n [3]Only Numbers",
    "\n [4]Alphanumerical",
    "\n [5]Alphanumerical w/ other characters",
    "\n [6]Exit and print passwords")
    # sets the option mumber for use
    option = int(input("Select option (1-6): "))

    # Makes sure the options are not outside the rande of available options
    while(option < 1 or option > 6):    
        option = int(input("Invalid option. Select option (1-6): "))
    
    # Terminates the loop immediately if option 6 is selected
    if(option == 6):
        looping = False
    # Continues to ask for password length greater than 6 before executing function. 
    else:
        passwordLength = int(input("What is the length?(Minimum 6 digits): "))
        while(passwordLength < 6):
            passwordLength = int(input("Length lower than minimum, give a length 6 or more digits: "))
        # Function executed by adding option number and length to the function params
        GeneratePassword(option, passwordLength)

# Outside the loop. Closes the file for writing, and opens it for reading
passwords.close()
pwfile = open("passwords.txt", "r")
lines = pwfile.readlines()

# Prints thank you message before printing passwords from file, using i as an counter
print("Thank you for using our product! Here are the results, please copy or rename file to prevent losing passwords: ")
i = 1
for line in lines:
    print("{}. {}".format(i, line))
    i += 1
# EOF