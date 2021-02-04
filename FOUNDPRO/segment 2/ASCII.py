# 5.02 ASCII Code
# @Shawn Velsor
# 2/1/2021

# This is to encode and decode ASCII strings.

message = "Sometimes, I dream of cheese..."
#This quote is from Half-Life 2

# Need to first encode the message
def Main():
    print("Encoded message: ")
    print(Encode())
    print()
    Guess()
    print("Decoded message: ")
    print(Decode())

# Encoding; uses a formatted string in order to allow it to 
# also be used with the decoding command.
def Encode():
    encoded = ""
    chars = list(message)
    
    for i in chars:
        encoded += "{0} ".format(ord(i))

    return encoded

# Decode; use the Split() function to create a usable array of int chars,
# Sets up new string of decoded usefulness.
def Decode():
    chars = list(Encode().split(" "))
    
    decoded = ''

    for i in chars:

        # Needs the int() in order to make it work correctly, since it is an str
        if (i != ''):
            decoded += chr(int(i))
        

    return decoded

def Guess():
    guess = ""
    print()
    while(True):
        guess = input("Guess the message! Hint: HL2 Quotes, do not count the spaces: ")

        if(guess == message):
            print("You guessed right!")
            break
        else:
            print("You failed, want to try again?")
            decide = input("say Y for Yes or N for No: ")
            if(str.lower(decide) == "n"):
                break 


Main()