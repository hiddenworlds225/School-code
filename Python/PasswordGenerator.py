import random
passwordLength = 0
pwlength = 0

passwords = open("passwords.txt", "w+")
passwords.flush()
looping = True


def GeneratePassword(num, length):
    password = ""
    randNum = 0
    pwlength = 0
    if(num == 1):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if(randNum >= 97 and randNum <= 122):
                password += chr(randNum)
                pwlength += 1
    if(num == 2):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if(randNum >= 65 and randNum <= 90):
                password += chr(randNum)
                pwlength += 1
    if(num == 3):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if(randNum >= 48 and randNum <= 57):
                password += chr(randNum)
                pwlength += 1
    if(num == 4):
        while (pwlength < length):
            randNum = random.randint(0, 128)
            if((randNum >= 97 and randNum <= 122) or (randNum >= 65 and randNum <= 90) or (randNum >= 48 and randNum <= 57)):
                password += chr(randNum)
                pwlength += 1
    if(num == 5):
        while (pwlength < length):
            randNum = random.randint(33, 126)
            password += chr(randNum)
            pwlength += 1
    passwords.writelines(password + "\n")

print("Welcome to the PasswordGenerator\u2122!")
while looping:
    print()
    print("Please select an option:",
    "\n [1]Only lowercase Numbers",
    "\n [2]Only Uppercase Numbers",
    "\n [3]Only Numbers",
    "\n [4]Alphanumerical",
    "\n [5]Alphanumerical w/ other characters",
    "\n [6]Exit and print passwords")
    option = int(input("Select option (1-6): "))

    while(option < 1 or option > 6):    
        option = int(input("Invalid option. Select option (1-6): "))
    

    if(option == 6):
        looping = False
    else:
        passwordLength = int(input("What is the length?(Minimum 6 digits): "))
        while(passwordLength < 6):
            passwordLength = input("Length lower than minimum, give a length 6 or more digits: ")
        GeneratePassword(option, passwordLength)

passwords.close()
pwfile = open("passwords.txt", "r")
lines = pwfile.readlines()

print("Thank you for using our product! Here are the results, please copy or rename file to prevent losing passwords: ")
i = 1
for line in lines:
    print("{}. {}".format(i, line))
    i += 1